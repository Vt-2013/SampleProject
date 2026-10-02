public class Cases {
    public static void main(String[] args) {
        int Wind_Density =80;
        int Rain_Depth =80;

        if (Wind_Density >= 80 && Rain_Depth >= 80) {
            System.out.println("There are chances of a Thunderstorm. All Civilians are requested to seek shelter immediately.");
        }

        else if (Wind_Density >= 60) {
            System.out.println("There might be chances of a cyclone all civilians are requested to stay on high alert.");
        }
        else if (Rain_Depth >= 60) {
            System.out.println("There might be chances of a flood all civilians are requested to stay on high alert");
        }

        else
            System.out.println("The weather is normal, please continue with your lifestyles.");
    }
}
