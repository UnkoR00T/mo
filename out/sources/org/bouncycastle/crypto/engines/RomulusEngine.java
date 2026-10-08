package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.RomulusDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes5.dex */
public class RomulusEngine extends AEADBaseEngine {
    private static final int AD_BLK_LEN_HALF = 16;
    private final byte[] CNT;
    private Instance instance;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f149055k;
    private byte[] npub;
    private static final byte[] sbox_8 = {101, 76, 106, 66, 75, 99, 67, 107, 85, 117, 90, 122, 83, 115, 91, 123, 53, -116, 58, -127, -119, 51, -128, 59, -107, 37, -104, 42, -112, 35, -103, 43, -27, -52, -24, -63, -55, -32, -64, -23, -43, -11, -40, -8, -48, -16, -39, -7, -91, 28, -88, 18, 27, -96, 19, -87, 5, -75, 10, -72, 3, -80, 11, -71, 50, -120, 60, -123, -115, 52, -124, 61, -111, 34, -100, 44, -108, 36, -99, 45, 98, 74, 108, 69, 77, 100, 68, 109, 82, 114, 92, 124, 84, 116, 93, 125, -95, 26, -84, 21, 29, -92, 20, -83, 2, -79, 12, PSSSigner.TRAILER_IMPLICIT, 4, -76, 13, -67, -31, -56, -20, -59, -51, -28, -60, -19, -47, -15, -36, -4, -44, -12, -35, -3, 54, -114, 56, -126, -117, 48, -125, 57, -106, 38, -102, 40, -109, 32, -101, 41, 102, 78, 104, 65, 73, 96, 64, 105, 86, 118, 88, 120, 80, 112, 89, 121, -90, 30, -86, 17, 25, -93, 16, -85, 6, -74, 8, -70, 0, -77, 9, -69, -26, -50, -22, -62, -53, -29, -61, -21, -42, -10, -38, -6, -45, -13, -37, -5, 49, -118, 62, -122, -113, 55, -121, 63, -110, 33, -98, 46, -105, 39, -97, 47, 97, 72, 110, 70, 79, 103, 71, 111, 81, 113, 94, 126, 87, 119, 95, 127, -94, 24, -82, 22, 31, -89, 23, -81, 1, -78, 14, -66, 7, -73, 15, -65, -30, -54, -18, -58, -49, -25, -57, -17, -46, -14, -34, -2, -41, -9, -33, -1};
    private static final byte[] TWEAKEY_P = {9, 15, 8, 13, 10, 14, 12, 11, 0, 1, 2, 3, 4, 5, 6, 7};
    private static final byte[] RC = {1, 3, 7, 15, 31, 62, 61, 59, 55, 47, 30, 60, 57, 51, 39, 14, 29, 58, 53, 43, 22, 44, 24, 48, 33, 2, 5, 11, 23, 46, 28, 56, 49, 35, 6, 13, 27, 54, 45, 26};

    private interface Instance {
        void processBufferAAD(byte[] bArr, int i15);

        void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16);

        void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16);

        void processFinalAAD();

        void processFinalBlock(byte[] bArr, int i15);

        void reset();
    }

    private class RomulusM implements Instance {
        private int offset;
        private final byte[] mac_s = new byte[16];
        private final byte[] mac_CNT = new byte[7];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final byte[] f149056s = new byte[16];
        private boolean twist = true;

        public RomulusM() {
        }

        int ad_encryption(byte[] bArr, int i15, byte[] bArr2, byte[] bArr3, int i16, byte[] bArr4) {
            byte[] bArr5 = new byte[16];
            byte[] bArr6 = new byte[16];
            int iMin = Math.min(i16, 16);
            int i17 = i16 - iMin;
            RomulusEngine.this.pad(bArr, i15, bArr6, 16, iMin);
            Bytes.xorTo(16, bArr6, bArr2);
            int i18 = i15 + iMin;
            this.offset = i18;
            RomulusEngine.this.lfsr_gf56(bArr4);
            if (i17 == 0) {
                return i17;
            }
            int iMin2 = Math.min(i17, 16);
            int i19 = i17 - iMin2;
            RomulusEngine.this.pad(bArr, i18, bArr5, 16, iMin2);
            this.offset = i18 + iMin2;
            RomulusEngine.this.block_cipher(bArr2, bArr3, bArr5, 0, bArr4, (byte) 44);
            RomulusEngine.this.lfsr_gf56(bArr4);
            return i19;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i15) {
            if (this.twist) {
                Bytes.xorTo(RomulusEngine.this.MAC_SIZE, bArr, i15, this.mac_s);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.block_cipher(this.mac_s, romulusEngine.f149055k, bArr, i15, this.mac_CNT, (byte) 40);
            }
            this.twist = !this.twist;
            RomulusEngine.this.lfsr_gf56(this.mac_CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            if (RomulusEngine.this.aadOperator.getLen() == 0) {
                RomulusEngine.this.lfsr_gf56(this.mac_CNT);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                int i15 = romulusEngine.m_aadPos;
                if (i15 != 0) {
                    Arrays.fill(romulusEngine.m_aad, i15, romulusEngine.BlockSize - 1, (byte) 0);
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    byte[] bArr = romulusEngine2.m_aad;
                    int i16 = romulusEngine2.BlockSize;
                    bArr[i16 - 1] = (byte) (romulusEngine2.m_aadPos & 15);
                    if (this.twist) {
                        Bytes.xorTo(i16, bArr, this.mac_s);
                    } else {
                        romulusEngine2.block_cipher(this.mac_s, romulusEngine2.f149055k, RomulusEngine.this.m_aad, 0, this.mac_CNT, (byte) 40);
                    }
                    RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                }
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.m_aadPos = 0;
            romulusEngine3.m_bufPos = romulusEngine3.dataOperator.getLen();
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0050 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:25:0x0052  */
        /* JADX WARN: Code duplicated, block: B:28:0x005c  */
        /* JADX WARN: Code duplicated, block: B:30:0x0060  */
        /* JADX WARN: Code duplicated, block: B:31:0x0092 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x0094  */
        /* JADX WARN: Code duplicated, block: B:35:0x009d A[LOOP:0: B:34:0x009b->B:35:0x009d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:42:0x0117 A[LOOP:1: B:41:0x0115->B:42:0x0117, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:44:0x015b  */
        /* JADX WARN: Code duplicated, block: B:47:0x0162  */
        /* JADX WARN: Code duplicated, block: B:49:0x0166  */
        /* JADX WARN: Code duplicated, block: B:50:0x019a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x019c  */
        /* JADX WARN: Code duplicated, block: B:54:0x01a5 A[LOOP:2: B:53:0x01a3->B:54:0x01a5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i15) {
            byte b15;
            int i16;
            int i17;
            int i18;
            byte b16;
            RomulusEngine romulusEngine;
            int i19;
            int iAd_encryption;
            int i25;
            RomulusEngine romulusEngine2;
            int i26;
            int i27;
            int i28;
            int len = RomulusEngine.this.aadOperator.getLen();
            int len2 = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            int i29 = len2 - (romulusEngine3.forEncryption ? 0 : romulusEngine3.MAC_SIZE);
            byte[] bytes = ((AEADBaseEngine.StreamDataOperator) romulusEngine3.dataOperator).getBytes();
            int i35 = len & 31;
            int i36 = 16;
            if (i35 == 0 && len != 0) {
                i16 = 56;
            } else {
                if (i35 >= 16) {
                    if (i35 != 16) {
                        i16 = 58;
                    } else {
                        b15 = 48;
                    }
                    i17 = i29 & 31;
                    if (i17 != 0 && i29 != 0) {
                        i18 = b15 ^ 4;
                    } else {
                        if (i17 >= 16) {
                            if (i17 != 16) {
                                i18 = b15 ^ 5;
                            }
                            b16 = b15;
                            romulusEngine = RomulusEngine.this;
                            i19 = 0;
                            if (romulusEngine.forEncryption) {
                                if ((b16 & 8) == 0) {
                                    byte[] bArr2 = new byte[16];
                                    int iMin = Math.min(i29, 16);
                                    RomulusEngine.this.pad(bytes, 0, bArr2, 16, iMin);
                                    RomulusEngine romulusEngine4 = RomulusEngine.this;
                                    romulusEngine4.block_cipher(this.mac_s, romulusEngine4.f149055k, bArr2, 0, this.mac_CNT, (byte) 44);
                                    RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                                    iAd_encryption = i29 - iMin;
                                    i28 = iMin;
                                } else {
                                    if (i29 == 0) {
                                        romulusEngine.lfsr_gf56(this.mac_CNT);
                                    }
                                    iAd_encryption = i29;
                                    i28 = 0;
                                }
                                while (iAd_encryption > 0) {
                                    this.offset = i28;
                                    iAd_encryption = ad_encryption(bytes, i28, this.mac_s, RomulusEngine.this.f149055k, iAd_encryption, this.mac_CNT);
                                    i28 = this.offset;
                                }
                                RomulusEngine romulusEngine5 = RomulusEngine.this;
                                romulusEngine5.block_cipher(this.mac_s, romulusEngine5.f149055k, RomulusEngine.this.npub, 0, this.mac_CNT, b16);
                                RomulusEngine romulusEngine6 = RomulusEngine.this;
                                romulusEngine6.g8A(this.mac_s, romulusEngine6.mac, 0);
                                i19 = i28 - i29;
                            } else {
                                System.arraycopy(bytes, i29, romulusEngine.mac, 0, romulusEngine.MAC_SIZE);
                                iAd_encryption = i29;
                            }
                            RomulusEngine romulusEngine7 = RomulusEngine.this;
                            romulusEngine7.reset_lfsr_gf56(romulusEngine7.CNT);
                            System.arraycopy(RomulusEngine.this.mac, 0, this.f149056s, 0, 16);
                            if (i29 > 0) {
                                RomulusEngine romulusEngine8 = RomulusEngine.this;
                                romulusEngine8.block_cipher(this.f149056s, romulusEngine8.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 36);
                                i27 = i15;
                                while (i29 > i36) {
                                    i29 -= 16;
                                    RomulusEngine.this.rho(bytes, i19, bArr, i27, this.f149056s, 16);
                                    i27 += 16;
                                    i19 += 16;
                                    RomulusEngine romulusEngine9 = RomulusEngine.this;
                                    romulusEngine9.lfsr_gf56(romulusEngine9.CNT);
                                    RomulusEngine romulusEngine10 = RomulusEngine.this;
                                    romulusEngine10.block_cipher(this.f149056s, romulusEngine10.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 36);
                                    i36 = i36;
                                }
                                i25 = i36;
                                RomulusEngine.this.rho(bytes, i19, bArr, i27, this.f149056s, i29);
                            } else {
                                i25 = 16;
                            }
                            romulusEngine2 = RomulusEngine.this;
                            if (romulusEngine2.forEncryption) {
                            }
                            if ((b16 & 8) == 0) {
                                byte[] bArr3 = new byte[i25];
                                int iMin2 = Math.min(iAd_encryption, i25);
                                iAd_encryption -= iMin2;
                                RomulusEngine.this.pad(bArr, i15, bArr3, 16, iMin2);
                                RomulusEngine romulusEngine11 = RomulusEngine.this;
                                romulusEngine11.block_cipher(this.mac_s, romulusEngine11.f149055k, bArr3, 0, this.mac_CNT, (byte) 44);
                                RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                                i26 = i15 + iMin2;
                            } else {
                                if (i29 == 0) {
                                    romulusEngine2.lfsr_gf56(this.mac_CNT);
                                }
                                i26 = i15;
                            }
                            while (iAd_encryption > 0) {
                                this.offset = i26;
                                iAd_encryption = ad_encryption(bArr, i26, this.mac_s, RomulusEngine.this.f149055k, iAd_encryption, this.mac_CNT);
                                i26 = this.offset;
                            }
                            RomulusEngine romulusEngine12 = RomulusEngine.this;
                            romulusEngine12.block_cipher(this.mac_s, romulusEngine12.f149055k, RomulusEngine.this.npub, 0, this.mac_CNT, b16);
                            RomulusEngine romulusEngine13 = RomulusEngine.this;
                            romulusEngine13.g8A(this.mac_s, romulusEngine13.mac, 0);
                            int len3 = RomulusEngine.this.dataOperator.getLen();
                            RomulusEngine romulusEngine14 = RomulusEngine.this;
                            int i37 = romulusEngine14.MAC_SIZE;
                            System.arraycopy(bytes, len3 - i37, romulusEngine14.m_buf, 0, i37);
                            RomulusEngine.this.m_bufPos = 0;
                        }
                        i18 = b15 ^ 1;
                    }
                    b15 = (byte) i18;
                    b16 = b15;
                    romulusEngine = RomulusEngine.this;
                    i19 = 0;
                    if (romulusEngine.forEncryption) {
                        if ((b16 & 8) == 0) {
                            byte[] bArr4 = new byte[16];
                            int iMin3 = Math.min(i29, 16);
                            RomulusEngine.this.pad(bytes, 0, bArr4, 16, iMin3);
                            RomulusEngine romulusEngine15 = RomulusEngine.this;
                            romulusEngine15.block_cipher(this.mac_s, romulusEngine15.f149055k, bArr4, 0, this.mac_CNT, (byte) 44);
                            RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                            iAd_encryption = i29 - iMin3;
                            i28 = iMin3;
                        } else {
                            if (i29 == 0) {
                                romulusEngine.lfsr_gf56(this.mac_CNT);
                            }
                            iAd_encryption = i29;
                            i28 = 0;
                        }
                        while (iAd_encryption > 0) {
                            this.offset = i28;
                            iAd_encryption = ad_encryption(bytes, i28, this.mac_s, RomulusEngine.this.f149055k, iAd_encryption, this.mac_CNT);
                            i28 = this.offset;
                        }
                        RomulusEngine romulusEngine16 = RomulusEngine.this;
                        romulusEngine16.block_cipher(this.mac_s, romulusEngine16.f149055k, RomulusEngine.this.npub, 0, this.mac_CNT, b16);
                        RomulusEngine romulusEngine17 = RomulusEngine.this;
                        romulusEngine17.g8A(this.mac_s, romulusEngine17.mac, 0);
                        i19 = i28 - i29;
                    } else {
                        System.arraycopy(bytes, i29, romulusEngine.mac, 0, romulusEngine.MAC_SIZE);
                        iAd_encryption = i29;
                    }
                    RomulusEngine romulusEngine18 = RomulusEngine.this;
                    romulusEngine18.reset_lfsr_gf56(romulusEngine18.CNT);
                    System.arraycopy(RomulusEngine.this.mac, 0, this.f149056s, 0, 16);
                    if (i29 > 0) {
                        RomulusEngine romulusEngine19 = RomulusEngine.this;
                        romulusEngine19.block_cipher(this.f149056s, romulusEngine19.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 36);
                        i27 = i15;
                        while (i29 > i36) {
                            i29 -= 16;
                            RomulusEngine.this.rho(bytes, i19, bArr, i27, this.f149056s, 16);
                            i27 += 16;
                            i19 += 16;
                            RomulusEngine romulusEngine20 = RomulusEngine.this;
                            romulusEngine20.lfsr_gf56(romulusEngine20.CNT);
                            RomulusEngine romulusEngine110 = RomulusEngine.this;
                            romulusEngine110.block_cipher(this.f149056s, romulusEngine110.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 36);
                            i36 = i36;
                        }
                        i25 = i36;
                        RomulusEngine.this.rho(bytes, i19, bArr, i27, this.f149056s, i29);
                    } else {
                        i25 = 16;
                    }
                    romulusEngine2 = RomulusEngine.this;
                    if (romulusEngine2.forEncryption) {
                        if ((b16 & 8) == 0) {
                            byte[] bArr5 = new byte[i25];
                            int iMin4 = Math.min(iAd_encryption, i25);
                            iAd_encryption -= iMin4;
                            RomulusEngine.this.pad(bArr, i15, bArr5, 16, iMin4);
                            RomulusEngine romulusEngine111 = RomulusEngine.this;
                            romulusEngine111.block_cipher(this.mac_s, romulusEngine111.f149055k, bArr5, 0, this.mac_CNT, (byte) 44);
                            RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                            i26 = i15 + iMin4;
                        } else {
                            if (i29 == 0) {
                                romulusEngine2.lfsr_gf56(this.mac_CNT);
                            }
                            i26 = i15;
                        }
                        while (iAd_encryption > 0) {
                            this.offset = i26;
                            iAd_encryption = ad_encryption(bArr, i26, this.mac_s, RomulusEngine.this.f149055k, iAd_encryption, this.mac_CNT);
                            i26 = this.offset;
                        }
                        RomulusEngine romulusEngine112 = RomulusEngine.this;
                        romulusEngine112.block_cipher(this.mac_s, romulusEngine112.f149055k, RomulusEngine.this.npub, 0, this.mac_CNT, b16);
                        RomulusEngine romulusEngine113 = RomulusEngine.this;
                        romulusEngine113.g8A(this.mac_s, romulusEngine113.mac, 0);
                        int len4 = RomulusEngine.this.dataOperator.getLen();
                        RomulusEngine romulusEngine114 = RomulusEngine.this;
                        int i38 = romulusEngine114.MAC_SIZE;
                        System.arraycopy(bytes, len4 - i38, romulusEngine114.m_buf, 0, i38);
                        RomulusEngine.this.m_bufPos = 0;
                    }
                }
                i16 = 50;
            }
            b15 = (byte) i16;
            i17 = i29 & 31;
            if (i17 != 0) {
                if (i17 >= 16) {
                    i18 = b15 ^ 1;
                } else if (i17 != 16) {
                    i18 = b15 ^ 5;
                }
                b15 = (byte) i18;
            } else {
                if (i17 >= 16) {
                    i18 = b15 ^ 1;
                } else if (i17 != 16) {
                    i18 = b15 ^ 5;
                }
                b15 = (byte) i18;
            }
            b16 = b15;
            romulusEngine = RomulusEngine.this;
            i19 = 0;
            if (romulusEngine.forEncryption) {
                if ((b16 & 8) == 0) {
                    byte[] bArr6 = new byte[16];
                    int iMin5 = Math.min(i29, 16);
                    RomulusEngine.this.pad(bytes, 0, bArr6, 16, iMin5);
                    RomulusEngine romulusEngine115 = RomulusEngine.this;
                    romulusEngine115.block_cipher(this.mac_s, romulusEngine115.f149055k, bArr6, 0, this.mac_CNT, (byte) 44);
                    RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                    iAd_encryption = i29 - iMin5;
                    i28 = iMin5;
                } else {
                    if (i29 == 0) {
                        romulusEngine.lfsr_gf56(this.mac_CNT);
                    }
                    iAd_encryption = i29;
                    i28 = 0;
                }
                while (iAd_encryption > 0) {
                    this.offset = i28;
                    iAd_encryption = ad_encryption(bytes, i28, this.mac_s, RomulusEngine.this.f149055k, iAd_encryption, this.mac_CNT);
                    i28 = this.offset;
                }
                RomulusEngine romulusEngine116 = RomulusEngine.this;
                romulusEngine116.block_cipher(this.mac_s, romulusEngine116.f149055k, RomulusEngine.this.npub, 0, this.mac_CNT, b16);
                RomulusEngine romulusEngine117 = RomulusEngine.this;
                romulusEngine117.g8A(this.mac_s, romulusEngine117.mac, 0);
                i19 = i28 - i29;
            } else {
                System.arraycopy(bytes, i29, romulusEngine.mac, 0, romulusEngine.MAC_SIZE);
                iAd_encryption = i29;
            }
            RomulusEngine romulusEngine118 = RomulusEngine.this;
            romulusEngine118.reset_lfsr_gf56(romulusEngine118.CNT);
            System.arraycopy(RomulusEngine.this.mac, 0, this.f149056s, 0, 16);
            if (i29 > 0) {
                RomulusEngine romulusEngine119 = RomulusEngine.this;
                romulusEngine119.block_cipher(this.f149056s, romulusEngine119.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 36);
                i27 = i15;
                while (i29 > i36) {
                    i29 -= 16;
                    RomulusEngine.this.rho(bytes, i19, bArr, i27, this.f149056s, 16);
                    i27 += 16;
                    i19 += 16;
                    RomulusEngine romulusEngine21 = RomulusEngine.this;
                    romulusEngine21.lfsr_gf56(romulusEngine21.CNT);
                    RomulusEngine romulusEngine1110 = RomulusEngine.this;
                    romulusEngine1110.block_cipher(this.f149056s, romulusEngine1110.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 36);
                    i36 = i36;
                }
                i25 = i36;
                RomulusEngine.this.rho(bytes, i19, bArr, i27, this.f149056s, i29);
            } else {
                i25 = 16;
            }
            romulusEngine2 = RomulusEngine.this;
            if (romulusEngine2.forEncryption) {
                if ((b16 & 8) == 0) {
                    byte[] bArr7 = new byte[i25];
                    int iMin6 = Math.min(iAd_encryption, i25);
                    iAd_encryption -= iMin6;
                    RomulusEngine.this.pad(bArr, i15, bArr7, 16, iMin6);
                    RomulusEngine romulusEngine1111 = RomulusEngine.this;
                    romulusEngine1111.block_cipher(this.mac_s, romulusEngine1111.f149055k, bArr7, 0, this.mac_CNT, (byte) 44);
                    RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                    i26 = i15 + iMin6;
                } else {
                    if (i29 == 0) {
                        romulusEngine2.lfsr_gf56(this.mac_CNT);
                    }
                    i26 = i15;
                }
                while (iAd_encryption > 0) {
                    this.offset = i26;
                    iAd_encryption = ad_encryption(bArr, i26, this.mac_s, RomulusEngine.this.f149055k, iAd_encryption, this.mac_CNT);
                    i26 = this.offset;
                }
                RomulusEngine romulusEngine1112 = RomulusEngine.this;
                romulusEngine1112.block_cipher(this.mac_s, romulusEngine1112.f149055k, RomulusEngine.this.npub, 0, this.mac_CNT, b16);
                RomulusEngine romulusEngine1113 = RomulusEngine.this;
                romulusEngine1113.g8A(this.mac_s, romulusEngine1113.mac, 0);
                int len5 = RomulusEngine.this.dataOperator.getLen();
                RomulusEngine romulusEngine1114 = RomulusEngine.this;
                int i39 = romulusEngine1114.MAC_SIZE;
                System.arraycopy(bytes, len5 - i39, romulusEngine1114.m_buf, 0, i39);
                RomulusEngine.this.m_bufPos = 0;
            }
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f149056s);
            Arrays.clear(this.mac_s);
            RomulusEngine.this.reset_lfsr_gf56(this.mac_CNT);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }
    }

    private class RomulusN implements Instance {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final byte[] f149057s = new byte[16];
        boolean twist;

        public RomulusN() {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i15) {
            if (this.twist) {
                Bytes.xorTo(16, bArr, i15, this.f149057s);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.block_cipher(this.f149057s, romulusEngine.f149055k, bArr, i15, RomulusEngine.this.CNT, (byte) 8);
            }
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.lfsr_gf56(romulusEngine2.CNT);
            this.twist = !this.twist;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
            RomulusEngine.this.g8A(this.f149057s, bArr2, i16);
            for (int i17 = 0; i17 < 16; i17++) {
                int i18 = i17 + i16;
                byte b15 = (byte) (bArr2[i18] ^ bArr[i17 + i15]);
                bArr2[i18] = b15;
                byte[] bArr3 = this.f149057s;
                bArr3[i17] = (byte) (b15 ^ bArr3[i17]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.f149057s, romulusEngine2.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
            RomulusEngine.this.g8A(this.f149057s, bArr2, i16);
            for (int i17 = 0; i17 < 16; i17++) {
                byte[] bArr3 = this.f149057s;
                int i18 = i17 + i15;
                bArr3[i17] = (byte) (bArr3[i17] ^ bArr[i18]);
                int i19 = i17 + i16;
                bArr2[i19] = (byte) (bArr2[i19] ^ bArr[i18]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.f149057s, romulusEngine2.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            int i15 = RomulusEngine.this.m_aadPos;
            if (i15 != 0) {
                byte[] bArr = new byte[16];
                int iMin = Math.min(i15, 16);
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.pad(romulusEngine.m_aad, 0, bArr, 16, iMin);
                if (this.twist) {
                    Bytes.xorTo(16, bArr, this.f149057s);
                } else {
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    romulusEngine2.block_cipher(this.f149057s, romulusEngine2.f149055k, bArr, 0, RomulusEngine.this.CNT, (byte) 8);
                }
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
            }
            if (RomulusEngine.this.aadOperator.getLen() == 0) {
                RomulusEngine romulusEngine4 = RomulusEngine.this;
                romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                romulusEngine5.block_cipher(this.f149057s, romulusEngine5.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 26);
            } else {
                RomulusEngine romulusEngine6 = RomulusEngine.this;
                int i16 = romulusEngine6.m_aadPos & 15;
                byte[] bArr2 = this.f149057s;
                byte[] bArr3 = romulusEngine6.f149055k;
                if (i16 != 0) {
                    romulusEngine6.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 26);
                } else {
                    romulusEngine6.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 24);
                }
            }
            RomulusEngine romulusEngine7 = RomulusEngine.this;
            romulusEngine7.reset_lfsr_gf56(romulusEngine7.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i15) {
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            if (len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE) == 0) {
                romulusEngine.lfsr_gf56(romulusEngine.CNT);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.f149057s, romulusEngine2.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 21);
            } else {
                int i16 = romulusEngine.m_bufPos;
                if (i16 != 0) {
                    int iMin = Math.min(i16, 16);
                    RomulusEngine romulusEngine3 = RomulusEngine.this;
                    romulusEngine3.rho(romulusEngine3.m_buf, 0, bArr, i15, this.f149057s, iMin);
                    RomulusEngine romulusEngine4 = RomulusEngine.this;
                    romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                    RomulusEngine romulusEngine5 = RomulusEngine.this;
                    romulusEngine5.block_cipher(this.f149057s, romulusEngine5.f149055k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, RomulusEngine.this.m_bufPos == 16 ? (byte) 20 : (byte) 21);
                }
            }
            RomulusEngine romulusEngine6 = RomulusEngine.this;
            romulusEngine6.g8A(this.f149057s, romulusEngine6.mac, 0);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f149057s);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }
    }

    public static class RomulusParameters {
        public static final int ROMULUS_M = 0;
        public static final int ROMULUS_N = 1;
        public static final int ROMULUS_T = 2;
        public static final RomulusParameters RomulusM = new RomulusParameters(0);
        public static final RomulusParameters RomulusN = new RomulusParameters(1);
        public static final RomulusParameters RomulusT = new RomulusParameters(2);
        private final int ord;

        RomulusParameters(int i15) {
            this.ord = i15;
        }
    }

    private class RomulusT implements Instance {
        byte[] CNT_Z;
        byte[] LR;
        byte[] S;
        byte[] T;
        byte[] Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f149058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f149059h;

        private RomulusT() {
            this.f149059h = new byte[16];
            this.f149058g = new byte[16];
            this.Z = new byte[16];
            this.CNT_Z = new byte[7];
            this.LR = new byte[32];
            this.T = new byte[16];
            this.S = new byte[16];
        }

        private void processAfterAbsorbCiphertext() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i15 = romulusEngine.m_aadPos;
            int i16 = romulusEngine.BlockSize;
            if (i15 == i16) {
                RomulusEngine.hirose_128_128_256(this.f149059h, this.f149058g, romulusEngine.m_aad, 0);
                RomulusEngine.this.m_aadPos = 0;
            } else {
                romulusEngine.m_aadPos = i16;
            }
            RomulusEngine.this.lfsr_gf56(this.CNT_Z);
        }

        private void processBuffer(byte[] bArr, int i15, byte[] bArr2, int i16) {
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.block_cipher(this.S, this.Z, this.T, 0, romulusEngine.CNT, (byte) 64);
            Bytes.xor(16, this.S, bArr, i15, bArr2, i16);
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, (byte) 65);
            System.arraycopy(this.S, 0, this.Z, 0, 16);
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i15) {
            RomulusEngine.hirose_128_128_256(this.f149059h, this.f149058g, bArr, i15);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
            processBuffer(bArr, i15, bArr2, i16);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr, i15, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
            processBuffer(bArr, i15, bArr2, i16);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr2, i16, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            Arrays.fill(romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.AADBufferSize - 1, (byte) 0);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            int i15 = romulusEngine2.m_aadPos;
            if (i15 >= 16) {
                byte[] bArr = romulusEngine2.m_aad;
                bArr[romulusEngine2.AADBufferSize - 1] = (byte) (i15 & 15);
                RomulusEngine.hirose_128_128_256(this.f149059h, this.f149058g, bArr, 0);
                RomulusEngine.this.m_aadPos = 0;
                return;
            }
            if (i15 < 0 || romulusEngine2.aadOperator.getLen() == 0) {
                return;
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            byte[] bArr2 = romulusEngine3.m_aad;
            int i16 = romulusEngine3.BlockSize;
            bArr2[i16 - 1] = (byte) (romulusEngine3.m_aadPos & 15);
            romulusEngine3.m_aadPos = i16;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i15) {
            char c15;
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i16 = len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE);
            int i17 = romulusEngine.m_bufPos;
            if (i17 != 0) {
                int iMin = Math.min(i17, 16);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, (byte) 64);
                Bytes.xor(iMin, RomulusEngine.this.m_buf, this.S, bArr, i15);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
                RomulusEngine romulusEngine4 = RomulusEngine.this;
                if (!romulusEngine4.forEncryption) {
                    bArr = romulusEngine4.m_buf;
                    i15 = 0;
                }
                System.arraycopy(bArr, i15, romulusEngine4.m_aad, romulusEngine4.m_aadPos, romulusEngine4.m_bufPos);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                Arrays.fill(romulusEngine5.m_aad, romulusEngine5.m_aadPos + romulusEngine5.m_bufPos, romulusEngine5.AADBufferSize - 1, (byte) 0);
                RomulusEngine romulusEngine6 = RomulusEngine.this;
                byte[] bArr2 = romulusEngine6.m_aad;
                int i18 = romulusEngine6.m_aadPos;
                bArr2[(romulusEngine6.BlockSize + i18) - 1] = (byte) (romulusEngine6.m_bufPos & 15);
                if (i18 == 0) {
                    byte[] bArr3 = romulusEngine6.npub;
                    RomulusEngine romulusEngine7 = RomulusEngine.this;
                    byte[] bArr4 = romulusEngine7.m_aad;
                    int i19 = romulusEngine7.BlockSize;
                    System.arraycopy(bArr3, 0, bArr4, i19, i19);
                    c15 = 0;
                } else {
                    c15 = 16;
                }
                RomulusEngine.hirose_128_128_256(this.f149059h, this.f149058g, RomulusEngine.this.m_aad, 0);
                RomulusEngine.this.lfsr_gf56(this.CNT_Z);
            } else if (romulusEngine.m_aadPos != 0) {
                if (i16 > 0) {
                    Arrays.fill(romulusEngine.m_aad, romulusEngine.BlockSize, romulusEngine.AADBufferSize, (byte) 0);
                } else {
                    if (romulusEngine.aadOperator.getLen() != 0) {
                        byte[] bArr5 = RomulusEngine.this.npub;
                        RomulusEngine romulusEngine8 = RomulusEngine.this;
                        System.arraycopy(bArr5, 0, romulusEngine8.m_aad, romulusEngine8.m_aadPos, 16);
                        RomulusEngine.this.m_aadPos = 0;
                        c15 = 0;
                    }
                    RomulusEngine.hirose_128_128_256(this.f149059h, this.f149058g, RomulusEngine.this.m_aad, 0);
                }
                c15 = 16;
                RomulusEngine.hirose_128_128_256(this.f149059h, this.f149058g, RomulusEngine.this.m_aad, 0);
            } else if (i16 > 0) {
                Arrays.fill(romulusEngine.m_aad, 0, romulusEngine.BlockSize, (byte) 0);
                byte[] bArr6 = RomulusEngine.this.npub;
                RomulusEngine romulusEngine9 = RomulusEngine.this;
                byte[] bArr7 = romulusEngine9.m_aad;
                int i25 = romulusEngine9.BlockSize;
                System.arraycopy(bArr6, 0, bArr7, i25, i25);
                RomulusEngine.hirose_128_128_256(this.f149059h, this.f149058g, RomulusEngine.this.m_aad, 0);
                c15 = 0;
            } else {
                c15 = 16;
            }
            if (c15 == 16) {
                System.arraycopy(RomulusEngine.this.npub, 0, RomulusEngine.this.m_aad, 0, 16);
                System.arraycopy(RomulusEngine.this.CNT, 0, RomulusEngine.this.m_aad, 16, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 23, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = 23;
            } else {
                System.arraycopy(this.CNT_Z, 0, RomulusEngine.this.m_aad, 0, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 7, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = 7;
            }
            byte[] bArr8 = this.f149059h;
            bArr8[0] = (byte) (bArr8[0] ^ 2);
            RomulusEngine.hirose_128_128_256(bArr8, this.f149058g, RomulusEngine.this.m_aad, 0);
            System.arraycopy(this.f149059h, 0, this.LR, 0, 16);
            System.arraycopy(this.f149058g, 0, this.LR, 16, 16);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine10 = RomulusEngine.this;
            romulusEngine10.block_cipher(this.LR, romulusEngine10.f149055k, this.LR, 16, this.CNT_Z, (byte) 68);
            byte[] bArr9 = this.LR;
            RomulusEngine romulusEngine11 = RomulusEngine.this;
            System.arraycopy(bArr9, 0, romulusEngine11.mac, 0, romulusEngine11.MAC_SIZE);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f149059h);
            Arrays.clear(this.f149058g);
            Arrays.clear(this.LR);
            Arrays.clear(this.T);
            Arrays.clear(this.S);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            System.arraycopy(RomulusEngine.this.npub, 0, this.Z, 0, RomulusEngine.this.IV_SIZE);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.Z, romulusEngine2.f149055k, this.T, 0, this.CNT_Z, (byte) 66);
            RomulusEngine.this.reset_lfsr_gf56(this.CNT_Z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public RomulusEngine(RomulusParameters romulusParameters) {
        Instance romulusM;
        AEADBaseEngine.ProcessingBufferType processingBufferType;
        AEADBaseEngine.DataOperatorType dataOperatorType;
        this.AADBufferSize = 16;
        this.BlockSize = 16;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.CNT = new byte[7];
        int i15 = romulusParameters.ord;
        if (i15 == 0) {
            this.algorithmName = "Romulus-M";
            romulusM = new RomulusM();
        } else {
            if (i15 != 1) {
                if (i15 == 2) {
                    this.algorithmName = "Romulus-T";
                    this.AADBufferSize = 32;
                    romulusM = new RomulusT();
                }
                if (romulusParameters == RomulusParameters.RomulusN) {
                    processingBufferType = AEADBaseEngine.ProcessingBufferType.Buffered;
                } else {
                    processingBufferType = AEADBaseEngine.ProcessingBufferType.Immediate;
                }
                AEADBaseEngine.AADOperatorType aADOperatorType = AEADBaseEngine.AADOperatorType.Counter;
                if (romulusParameters == RomulusParameters.RomulusM) {
                    dataOperatorType = AEADBaseEngine.DataOperatorType.Stream;
                } else {
                    dataOperatorType = AEADBaseEngine.DataOperatorType.Counter;
                }
                setInnerMembers(processingBufferType, aADOperatorType, dataOperatorType);
            }
            this.algorithmName = "Romulus-N";
            romulusM = new RomulusN();
        }
        this.instance = romulusM;
        if (romulusParameters == RomulusParameters.RomulusN) {
            processingBufferType = AEADBaseEngine.ProcessingBufferType.Buffered;
        } else {
            processingBufferType = AEADBaseEngine.ProcessingBufferType.Immediate;
        }
        AEADBaseEngine.AADOperatorType aADOperatorType2 = AEADBaseEngine.AADOperatorType.Counter;
        if (romulusParameters == RomulusParameters.RomulusM) {
            dataOperatorType = AEADBaseEngine.DataOperatorType.Stream;
        } else {
            dataOperatorType = AEADBaseEngine.DataOperatorType.Counter;
        }
        setInnerMembers(processingBufferType, aADOperatorType2, dataOperatorType);
    }

    public static void hirose_128_128_256(RomulusDigest.Friend friend, byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by RomulusDigest");
        }
        hirose_128_128_256(bArr, bArr2, bArr3, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset_lfsr_gf56(byte[] bArr) {
        bArr[0] = 1;
        Arrays.fill(bArr, 1, 7, (byte) 0);
    }

    private static void skinny_128_384_plus_enc(byte[] bArr, byte[] bArr2) {
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 4);
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 << 2;
            System.arraycopy(bArr, i16, bArr3[i15], 0, 4);
            System.arraycopy(bArr2, i16, bArr4[0][i15], 0, 4);
            System.arraycopy(bArr2, i16 + 16, bArr4[1][i15], 0, 4);
            System.arraycopy(bArr2, i16 + 32, bArr4[2][i15], 0, 4);
        }
        for (int i17 = 0; i17 < 40; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                for (int i19 = 0; i19 < 4; i19++) {
                    byte[] bArr6 = bArr3[i18];
                    bArr6[i19] = sbox_8[bArr6[i19] & 255];
                }
            }
            byte[] bArr7 = bArr3[0];
            byte b15 = bArr7[0];
            byte[] bArr8 = RC;
            bArr7[0] = (byte) (b15 ^ (bArr8[i17] & 15));
            byte[] bArr9 = bArr3[1];
            bArr9[0] = (byte) (bArr9[0] ^ ((bArr8[i17] >>> 4) & 3));
            byte[] bArr10 = bArr3[2];
            bArr10[0] = (byte) (bArr10[0] ^ 2);
            for (int i25 = 0; i25 <= 1; i25++) {
                for (int i26 = 0; i26 < 4; i26++) {
                    byte[] bArr11 = bArr3[i25];
                    bArr11[i26] = (byte) (bArr11[i26] ^ ((bArr4[0][i25][i26] ^ bArr4[1][i25][i26]) ^ bArr4[2][i25][i26]));
                }
            }
            for (int i27 = 0; i27 < 4; i27++) {
                for (int i28 = 0; i28 < 4; i28++) {
                    byte b16 = TWEAKEY_P[(i27 << 2) + i28];
                    int i29 = b16 >>> 2;
                    int i35 = b16 & 3;
                    bArr5[0][i27][i28] = bArr4[0][i29][i35];
                    bArr5[1][i27][i28] = bArr4[1][i29][i35];
                    bArr5[2][i27][i28] = bArr4[2][i29][i35];
                }
            }
            int i36 = 0;
            while (i36 <= 1) {
                for (int i37 = 0; i37 < 4; i37++) {
                    bArr4[0][i36][i37] = bArr5[0][i36][i37];
                    byte b17 = bArr5[1][i36][i37];
                    bArr4[1][i36][i37] = (byte) (((b17 >>> 5) & 1) ^ (((b17 << 1) & 254) ^ ((b17 >>> 7) & 1)));
                    byte b18 = bArr5[2][i36][i37];
                    bArr4[2][i36][i37] = (byte) (((b18 << 1) & 128) ^ (((b18 >>> 1) & CertificateBody.profileType) ^ ((b18 << 7) & 128)));
                }
                i36++;
            }
            while (i36 < 4) {
                for (int i38 = 0; i38 < 4; i38++) {
                    bArr4[0][i36][i38] = bArr5[0][i36][i38];
                    bArr4[1][i36][i38] = bArr5[1][i36][i38];
                    bArr4[2][i36][i38] = bArr5[2][i36][i38];
                }
                i36++;
            }
            byte[] bArr12 = bArr3[1];
            byte b19 = bArr12[3];
            bArr12[3] = bArr12[2];
            bArr12[2] = bArr12[1];
            bArr12[1] = bArr12[0];
            bArr12[0] = b19;
            byte[] bArr13 = bArr3[2];
            byte b25 = bArr13[0];
            bArr13[0] = bArr13[2];
            bArr13[2] = b25;
            byte b26 = bArr13[1];
            bArr13[1] = bArr13[3];
            bArr13[3] = b26;
            byte[] bArr14 = bArr3[3];
            byte b27 = bArr14[0];
            bArr14[0] = bArr14[1];
            bArr14[1] = bArr14[2];
            bArr14[2] = bArr14[3];
            bArr14[3] = b27;
            for (int i39 = 0; i39 < 4; i39++) {
                byte[] bArr15 = bArr3[1];
                byte b28 = bArr15[i39];
                byte[] bArr16 = bArr3[2];
                bArr15[i39] = (byte) (b28 ^ bArr16[i39]);
                byte b29 = bArr16[i39];
                byte[] bArr17 = bArr3[0];
                byte b35 = (byte) (b29 ^ bArr17[i39]);
                bArr16[i39] = b35;
                byte[] bArr18 = bArr3[3];
                byte b36 = (byte) (bArr18[i39] ^ b35);
                bArr18[i39] = b36;
                bArr18[i39] = bArr16[i39];
                bArr16[i39] = bArr15[i39];
                bArr15[i39] = bArr17[i39];
                bArr17[i39] = b36;
            }
        }
        for (int i45 = 0; i45 < 16; i45++) {
            bArr[i45] = (byte) (bArr3[i45 >>> 2][i45 & 3] & 255);
        }
    }

    void block_cipher(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, byte[] bArr4, byte b15) {
        byte[] bArr5 = new byte[48];
        System.arraycopy(bArr4, 0, bArr5, 0, 7);
        bArr5[7] = b15;
        System.arraycopy(bArr3, i15, bArr5, 16, 16);
        System.arraycopy(bArr2, 0, bArr5, 32, 16);
        skinny_128_384_plus_enc(bArr, bArr5);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void finishAAD(AEADBaseEngine.State state, boolean z15) {
        finishAAD1(state);
    }

    void g8A(byte[] bArr, byte[] bArr2, int i15) {
        int iMin = Math.min(bArr2.length - i15, 16);
        for (int i16 = 0; i16 < iMin; i16++) {
            byte b15 = bArr[i16];
            bArr2[i16 + i15] = (byte) (((b15 & 1) << 7) ^ (((b15 & 255) >>> 1) ^ (b15 & 128)));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i15) {
        return super.getOutputSize(i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i15) {
        return super.getUpdateOutputSize(i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z15, CipherParameters cipherParameters) {
        super.init(z15, cipherParameters);
    }

    void lfsr_gf56(byte[] bArr) {
        byte b15 = bArr[6];
        byte b16 = (byte) ((b15 & 255) >>> 7);
        byte b17 = bArr[5];
        bArr[6] = (byte) (((b15 & 255) << 1) | ((b17 & 255) >>> 7));
        int i15 = (b17 & 255) << 1;
        byte b18 = bArr[4];
        bArr[5] = (byte) (i15 | ((b18 & 255) >>> 7));
        int i16 = (b18 & 255) << 1;
        byte b19 = bArr[3];
        bArr[4] = (byte) (i16 | ((b19 & 255) >>> 7));
        int i17 = (b19 & 255) << 1;
        byte b25 = bArr[2];
        bArr[3] = (byte) (i17 | ((b25 & 255) >>> 7));
        byte b26 = bArr[1];
        bArr[2] = (byte) (((b25 & 255) << 1) | ((b26 & 255) >>> 7));
        int i18 = (b26 & 255) << 1;
        byte b27 = bArr[0];
        bArr[1] = (byte) (i18 | ((b27 & 255) >>> 7));
        int i19 = (b27 & 255) << 1;
        if (b16 == 1) {
            bArr[0] = (byte) (i19 ^ 149);
        } else {
            bArr[0] = (byte) i19;
        }
    }

    void pad(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        bArr2[i16 - 1] = (byte) (i17 & 15);
        System.arraycopy(bArr, i15, bArr2, 0, i17);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b15) {
        super.processAADByte(b15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i15, int i16) {
        super.processAADBytes(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferAAD(byte[] bArr, int i15) {
        this.instance.processBufferAAD(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        this.instance.processBufferDecrypt(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        this.instance.processBufferEncrypt(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b15, byte[] bArr, int i15) {
        return super.processByte(b15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        return super.processBytes(bArr, i15, i16, bArr2, i17);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalAAD() {
        this.instance.processFinalAAD();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        this.instance.processFinalBlock(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    void rho(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        int i18;
        byte[] bArr4 = new byte[16];
        pad(bArr, i15, bArr4, 16, i17);
        g8A(bArr3, bArr2, i16);
        if (this.forEncryption) {
            for (int i19 = 0; i19 < 16; i19++) {
                bArr3[i19] = (byte) (bArr3[i19] ^ bArr4[i19]);
                int i25 = i19 + i16;
                if (i19 < i17) {
                    bArr2[i25] = (byte) (bArr2[i25] ^ bArr4[i19]);
                } else {
                    bArr2[i25] = 0;
                }
            }
            return;
        }
        for (int i26 = 0; i26 < 16; i26++) {
            byte b15 = (byte) (bArr3[i26] ^ bArr4[i26]);
            bArr3[i26] = b15;
            if (i26 < i17 && (i18 = i26 + i16) < bArr2.length) {
                bArr3[i26] = (byte) (b15 ^ bArr2[i18]);
                bArr2[i18] = (byte) (bArr2[i18] ^ bArr4[i26]);
            }
        }
    }

    static void hirose_128_128_256(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        byte[] bArr4 = new byte[48];
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        bArr2[0] = (byte) (bArr2[0] ^ 1);
        System.arraycopy(bArr3, i15, bArr4, 16, 32);
        skinny_128_384_plus_enc(bArr, bArr4);
        skinny_128_384_plus_enc(bArr2, bArr4);
        for (int i16 = 0; i16 < 16; i16++) {
            bArr[i16] = (byte) (bArr[i16] ^ bArr5[i16]);
            bArr2[i16] = (byte) (bArr2[i16] ^ bArr5[i16]);
        }
        bArr2[0] = (byte) (bArr2[0] ^ 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        this.f149055k = bArr;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        this.instance.reset();
    }
}
