package BaiTapJames;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class TriangleApp {
    public static void main(String[] args) {
        try {
            // Nhập 3 cạnh của tam giác
            double side1 = getInput("Nhập cạnh thứ nhất: ");
            double side2 = getInput("Nhập cạnh thứ hai: ");
            double side3 = getInput("Nhập cạnh thứ ba: ");

            // Kiểm tra tính hợp lệ của tam giác
            if (isTriangleValid(side1, side2, side3)) {
                System.out.println("Đây là tam giác hợp lệ.");
            } else {
                throw new IllegalTriangleException("Đây không phải là tam giác hợp lệ.");
            }
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static double getInput(String prompt) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static boolean isTriangleValid(double side1, double side2, double side3) {
        // Kiểm tra xem có cạnh âm hay không
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        // Kiểm tra điều kiện tam giác
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return false;
        }

        return true;
    }
}
