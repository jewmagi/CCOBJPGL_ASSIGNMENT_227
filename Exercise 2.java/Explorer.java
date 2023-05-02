public interface Explorer {
 
        void visit(Mercury mercury);
    
        void visit(Mars mars);
    
        void visit(Saturn saturn);

        void visit(Earth earth);

        void visit(Venus venus);
    
        default void visit(Planet planets) {
            System.out.println("Landed on an unknown planet...");
        }
    }
    
