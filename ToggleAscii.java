class ToggleAscii {

    public static void main(String[] args) {

        String str1 = "ShivaRAJKundaPURA";
        char str[] = str1.toCharArray();
        int i = 0;

        while (i < str1.length()) {
            if (str[i] >= 'a' && str[i] <= 'z') {               
           str[i] = (char)(str[i] + 'A' - 'a');           
 } 
else if (str[i] >= 'A' && str[i] <= 'Z') {
                str[i] = (char)(str[i] + 'a' - 'A');
            }
            i++;
        }

        System.out.println("Toggled string: ");
        for (i = 0; i < str1.length(); i++) {
            System.out.print(str[i]);
        }
    }
}