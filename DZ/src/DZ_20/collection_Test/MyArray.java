package DZ_20.collection_Test;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray<T extends Number> implements Iterable<T>, Iterator<T> {

    private final static int CAPACITY = 10; // задает размерность массива
    private T mas[]; // массив для сохранения данных = пока что будем сохранять только целочисленные значения
    private int currentActualPosition; //указывает актуальное положение в массиве - сохраняет позицию последнего элемента +1

    //необходимо определить перем енную для курсора - итератора, т.е. для реализации логики проверки
    // "есть ли следующий элемент" -> смотреть метод hasNext- формируем нашу переменную/параметр/индекс int cursor =0
    // (указывает на первй элемент массива)
    private int cursor;

    public MyArray(T[] mas) {
        this.mas = mas;
    }

    public MyArray() {
        mas = (T[]) new Number[CAPACITY];
        currentActualPosition = 0;
    }

    public void add(T newElement) {
        if (currentActualPosition >= mas.length) {
            mas = Arrays.copyOf(mas, mas.length + CAPACITY); //записать в mas -> mas.length + CAPACITY
        }
        mas[currentActualPosition++] = newElement;

//        if(currentActualPosition >=0 && currentActualPosition < mas.length){// определяем, что место для нового элемента есть
//            mas[currentActualPosition++] = newElement; //ложим в нулевую позицию и сдвигаем
//
//        } else {
//            Arrays.copyOf(mas, mas.length + CAPACITY);
//            mas[currentActualPosition++] = newElement;
//        }
    }

    public void remove(int index) {

        int copyElementSize = mas.length - index - 1; // определяем хвост - кол-во элементов, которые нужно скопировать
        //кол-во элементов для копирования = кол-ву элементов стоящих/находящихся за позицией удаляемого элемента

        System.arraycopy(mas, index + 1, mas, index, copyElementSize); // перезатирание старого элемента находящегося
        // на позиции index - путем сдвига в лево (на одну позицию)
        mas[mas.length - 1] = null;// заменяем сдвинутые элементы нулями
        currentActualPosition--; //уменьшаем актуальную позицию
    }

    public void trimToSize() {
        mas = Arrays.copyOf(mas, currentActualPosition);
    }

    public T getMin() {
        T min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i].doubleValue() < min.doubleValue()) {
                min = mas[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < currentActualPosition; i++) {
            result.append(mas[i] + ", ");
        }
        result.append("]");
        return Arrays.toString(mas); // выведит значения массива в строку
    }

    public void printMyArray() {
        System.out.println(Arrays.toString(mas));
    }

    @Override
    public Iterator<T> iterator() {
        return this; //возвращаем самого себя т.е. iterator из MyArrayTest
    }

    @Override
    public boolean hasNext() {
        return cursor < currentActualPosition;//на тек момент курсор не добежал до конца нашего массива
    }

    @Override
    public T next() {
        return mas[cursor++];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyArray<?> myArray = (MyArray<?>) o;

        if (currentActualPosition != myArray.currentActualPosition) return false;
        if (cursor != myArray.cursor) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(mas, myArray.mas);

    }

    @Override
    public int hashCode() {
        int result = mas != null ? Arrays.hashCode(mas) : 0;
        result = 31 * result + currentActualPosition;
        result = 31 * result + cursor;
        return result;
    }
}
