package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
abstract class LowmcConstants {
    protected KMatrices KMatrix;
    protected KMatrices KMatrix_full;
    protected KMatrices KMatrix_inv;
    protected KMatrices LMatrix;
    protected KMatrices LMatrix_full;
    protected KMatrices LMatrix_inv;
    protected KMatrices RConstants;
    protected KMatrices RConstants_full;
    protected int[] keyMatrices;
    protected int[] keyMatrices_full;
    protected int[] keyMatrices_inv;
    protected int[] linearMatrices;
    protected int[] linearMatrices_full;
    protected int[] linearMatrices_inv;
    protected int[] roundConstants;
    protected int[] roundConstants_full;

    LowmcConstants() {
    }

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i15) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i15 * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    static int[] ReadFromProperty(Properties properties, String str, int i15) {
        byte[] bArrDecode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < bArrDecode.length / 4; i16++) {
            iArr[i16] = Pack.littleEndianToInt(bArrDecode, i16 * 4);
        }
        return iArr;
    }

    static int[] readArray(DataInputStream dataInputStream) throws IOException {
        int i15 = dataInputStream.readInt();
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 != i15; i16++) {
            iArr[i16] = dataInputStream.readInt();
        }
        return iArr;
    }

    private static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i15 = 0; i15 != str.length(); i15++) {
            if (str.charAt(i15) != ',') {
                byteArrayOutputStream.write(str.charAt(i15));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    protected KMatricesWithPointer KMatrix(PicnicEngine picnicEngine, int i15) {
        KMatrices kMatrices;
        int i16 = picnicEngine.stateSizeBits;
        if (i16 != 128) {
            if (i16 != 129) {
                if (i16 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.KMatrix;
                    }
                } else if (i16 != 255) {
                    if (i16 != 256) {
                        return null;
                    }
                    kMatrices = this.KMatrix;
                }
            }
            kMatrices = this.KMatrix_full;
        } else {
            kMatrices = this.KMatrix;
        }
        return GET_MAT(kMatrices, i15);
    }

    protected KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        int i15 = picnicEngine.stateSizeBits;
        if (i15 == 129 || ((i15 == 192 && picnicEngine.numRounds == 4) || i15 == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    protected KMatricesWithPointer LMatrix(PicnicEngine picnicEngine, int i15) {
        KMatrices kMatrices;
        int i16 = picnicEngine.stateSizeBits;
        if (i16 != 128) {
            if (i16 != 129) {
                if (i16 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.LMatrix;
                    }
                } else if (i16 != 255) {
                    if (i16 != 256) {
                        return null;
                    }
                    kMatrices = this.LMatrix;
                }
            }
            kMatrices = this.LMatrix_full;
        } else {
            kMatrices = this.LMatrix;
        }
        return GET_MAT(kMatrices, i15);
    }

    protected KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i15) {
        int i16 = picnicEngine.stateSizeBits;
        if (i16 == 129 || ((i16 == 192 && picnicEngine.numRounds == 4) || i16 == 255)) {
            return GET_MAT(this.LMatrix_inv, i15);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    protected KMatricesWithPointer RConstant(PicnicEngine picnicEngine, int i15) {
        KMatrices kMatrices;
        int i16 = picnicEngine.stateSizeBits;
        if (i16 != 128) {
            if (i16 != 129) {
                if (i16 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.RConstants;
                    }
                } else if (i16 != 255) {
                    if (i16 != 256) {
                        return null;
                    }
                    kMatrices = this.RConstants;
                }
            }
            kMatrices = this.RConstants_full;
        } else {
            kMatrices = this.RConstants;
        }
        return GET_MAT(kMatrices, i15);
    }
}
