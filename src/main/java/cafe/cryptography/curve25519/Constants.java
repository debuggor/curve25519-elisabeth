package cafe.cryptography.curve25519;

/**
 * Various constants and useful parameters.
 */
public final class Constants {
    /**
     * The order of the Ed25519 basepoint, $\ell = 2^{252} +
     * 27742317777372353535851937790883648493$.
     */
    public static final Scalar BASEPOINT_ORDER = new Scalar(new byte[] {
        // @formatter:off
        (byte) 0xed, (byte) 0xd3, (byte) 0xf5, 0x5c, 0x1a, 0x63, 0x12, 0x58,
        (byte) 0xd6, (byte) 0x9c, (byte) 0xf7, (byte) 0xa2, (byte) 0xde, (byte) 0xf9, (byte) 0xde, 0x14,
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x10,
        // @formatter:on
    });

    /**
     * Edwards $d$ value, equal to $-121665/121666 \bmod p$.
     */
    public static final FieldElement EDWARDS_D = new FieldElement(new int[] {
        // @formatter:off
        -10913610, 13857413, -15372611,   6949391,    114729,
         -8787816, -6275908,  -3247719, -18696448, -12055116,
        // @formatter:on
    });

    /**
     * Edwards $2*d$ value, equal to $2*(-121665/121666) \bmod p$.
     */
    public static final FieldElement EDWARDS_2D = new FieldElement(new int[] {
        // @formatter:off
        -21827239,  -5839606, -30745221, 13898782,  229458,
         15978800, -12551817,  -6495438, 29715968, 9444199,
        // @formatter:on
    });

    /**
     * Precomputed value of one of the square roots of -1 (mod p).
     */
    public static final FieldElement SQRT_M1 = new FieldElement(new int[] {
        // @formatter:off
        -32595792,  -7943725,  9377950, 3500415, 12389472,
          -272473, -25146209, -2005654,  326686, 11406482,
        // @formatter:on
    });

    /**
     * The Ed25519 basepoint, as an EdwardsPoint.
     */
    public static final EdwardsPoint ED25519_BASEPOINT = new EdwardsPoint(
    // @formatter:off
        new FieldElement(new int[] {
            -14297830,  -7645148, 16144683, -16471763, 27570974,
             -2696100, -26142465,  8378389,  20764389,  8758491,
        }),
        new FieldElement(new int[] {
            -26843541,  -6710886, 13421773, -13421773, 26843546,
              6710886, -13421773, 13421773, -26843546, -6710886,
        }),
        new FieldElement(new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }),
        new FieldElement(new int[] {
            28827062, -6116119, -27349572,   244363,  8635006,
            11264893, 19351346,  13413597, 16611511, -6414980,
        })
    // @formatter:on
    );
}