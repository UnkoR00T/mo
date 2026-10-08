package org.bouncycastle.crypto.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AlphabetMapper;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class BasicAlphabetMapper implements AlphabetMapper {
    private Map<Integer, Character> charMap;
    private Map<Character, Integer> indexMap;

    public BasicAlphabetMapper(String str) {
        this(str.toCharArray());
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public char[] convertToChars(byte[] bArr) {
        int i15 = 0;
        if (this.charMap.size() <= 256) {
            char[] cArr = new char[bArr.length];
            while (i15 != bArr.length) {
                cArr[i15] = this.charMap.get(Integer.valueOf(bArr[i15] & 255)).charValue();
                i15++;
            }
            return cArr;
        }
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException("two byte radix and input string odd length");
        }
        char[] cArr2 = new char[bArr.length / 2];
        while (i15 != bArr.length) {
            cArr2[i15 / 2] = this.charMap.get(Integer.valueOf(((bArr[i15] << 8) & 65280) | (bArr[i15 + 1] & 255))).charValue();
            i15 += 2;
        }
        return cArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public byte[] convertToIndexes(char[] cArr) {
        int i15 = 0;
        if (this.indexMap.size() <= 256) {
            byte[] bArr = new byte[cArr.length];
            while (i15 != cArr.length) {
                bArr[i15] = this.indexMap.get(Character.valueOf(cArr[i15])).byteValue();
                i15++;
            }
            return bArr;
        }
        byte[] bArr2 = new byte[cArr.length * 2];
        while (i15 != cArr.length) {
            int iIntValue = this.indexMap.get(Character.valueOf(cArr[i15])).intValue();
            int i16 = i15 * 2;
            bArr2[i16] = (byte) ((iIntValue >> 8) & GF2Field.MASK);
            bArr2[i16 + 1] = (byte) (iIntValue & GF2Field.MASK);
            i15++;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public int getRadix() {
        return this.indexMap.size();
    }

    public BasicAlphabetMapper(char[] cArr) {
        this.indexMap = new HashMap();
        this.charMap = new HashMap();
        for (int i15 = 0; i15 != cArr.length; i15++) {
            if (this.indexMap.containsKey(Character.valueOf(cArr[i15]))) {
                throw new IllegalArgumentException("duplicate key detected in alphabet: " + cArr[i15]);
            }
            this.indexMap.put(Character.valueOf(cArr[i15]), Integer.valueOf(i15));
            this.charMap.put(Integer.valueOf(i15), Character.valueOf(cArr[i15]));
        }
    }
}
