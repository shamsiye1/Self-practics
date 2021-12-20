package day13_Scanner;

/* write a program that can display the selected browser
    1.1 declear a string variable called browserName
    1.2 Assume that the valid browsers are: chrome. firefox, opera, safari, edge
    1.3 if the browser name does not match with the valid browsers' names, out put
        should be: Invalid Browser Name
 */
public class Browsers {
    public static void main(String[] args) {
        String browserName = "baidu";
        String result = "";

        switch (browserName) {
            case "chrome":
                result = "Chrome";
                break;
            case "Safari":
                result = "Opening Safari Browser";
                break;
            case "firefox":
                result = "Opening firefox browser";
                break;
            case "Opera":
                result = "Opening Opera browser";
                break;
            case "Edge":
                result = "Opening Edge browser";
                break;
            default:
                result = "Invalid browsers name";
        }
        System.out.println(result);


    }


}
