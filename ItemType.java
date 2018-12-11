package sample;

/**
 * Enum that defines the 4 different types of items
 */
public enum ItemType {
        AUDIO("AU"),
        VISUAL("VI"),
        AUDIO_MOBILE("AM"),
        VISUAL_MOBILE("VM");

        public final String code;

    /**
     * The enum constructor that takes a String
     * and assigns it to a field
     *
     * @param code String that assigns the fields code
     *             ex. AUDIO = AU
     */
    ItemType(String code){
            this.code = code;
        }
    }

