public class Food {
    public class Meals {
        private Food[] meals;

        public Food[] getFoods() {
            return meals;
        }
    }


    private String strMeal;
    private String strMealThumb;
    public Food(String strMeal,String strMealThumb) {

        this.strMeal = strMeal;
        this.strMealThumb = strMealThumb;
    }

    public String getStrMeal() {
        return strMeal;
    }
    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }
    public String getStrMealThumb() {
        return strMealThumb;
    }
    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    @Override
    public String toString() {
        return "Food [strMeal=" + strMeal + ", strMealThumb=" + strMealThumb + "]";
    }

}