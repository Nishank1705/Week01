public class pen {
        public static void main(String[] args) {
            int totalPens = 14; // Total number of pens
            int students = 3;   // Number of students
    
            
            int pensPerStudent = totalPens / students;// Calculate pens each student gets
    
           
            int remainingPens = totalPens % students; // Calculate remaining pens
    
            // Display results
            System.out.println("Each student will get " + pensPerStudent + " pens."+ "Remaining pens: " + remainingPens);
           
        }
    }
    
    
