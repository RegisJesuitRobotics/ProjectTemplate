package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    private Constants() {
        throw new UnsupportedOperationException("This is a utility class!");
    }

    public static class DriveConstants {
        private DriveConstants() {
            throw new UnsupportedOperationException("This is a utility class!");
        }

        public static final int DRIVE_FRONT_LEFT_ID = 1;
        public static final int DRIVE_FRONT_RIGHT_ID = 2;
        public static final int DRIVE_BACK_LEFT_ID = 3;
        public static final int DRIVE_BACK_RIGHT_ID = 4;
    }
}
