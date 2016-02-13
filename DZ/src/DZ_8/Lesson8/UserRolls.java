package DZ_8.Lesson8;

public enum UserRolls {
    DEFAULT_USER("default_user_description") {
        @Override
        public String toString() {
            return "new method 'toString' for DEFAULT_USER with description " + this.description;
        }
    },//ORDINAL -> 0
    SUPER_ADMIN("super_admin_description"){
        @Override
        public String toString() {
            return "new method 'toString' for SUPER_ADMIN with description " + this.description;
        }
    },//ORDINAL -> 1
    ADMIN{
        @Override
        public String toString() {
            return "new method 'toString' for admin " + this.description;
        }
    };//ORDINAL -> 2

    public String description;

    UserRolls() {

    }

    UserRolls(String description) {
        this.description = description;
    }

    public static UserRolls getUsersRoleByDescription(String descriptionForSearch) {
        for(UserRolls userRoles : values()) {
            if( descriptionForSearch.equals(userRoles.description)) {
                return userRoles;
            }
        }
        return DEFAULT_USER;
    }

}