package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1EncodableVector {
    private static final int DEFAULT_CAPACITY = 10;
    static final ASN1Encodable[] EMPTY_ELEMENTS = new ASN1Encodable[0];
    private boolean copyOnWrite;
    private int elementCount;
    private ASN1Encodable[] elements;

    public ASN1EncodableVector() {
        this(10);
    }

    static ASN1Encodable[] cloneElements(ASN1Encodable[] aSN1EncodableArr) {
        return aSN1EncodableArr.length < 1 ? EMPTY_ELEMENTS : (ASN1Encodable[]) aSN1EncodableArr.clone();
    }

    private void doAddAll(ASN1Encodable[] aSN1EncodableArr, String str) {
        int length = aSN1EncodableArr.length;
        if (length < 1) {
            return;
        }
        int length2 = this.elements.length;
        int i15 = this.elementCount + length;
        int i16 = 0;
        if ((i15 > length2) | this.copyOnWrite) {
            reallocate(i15);
        }
        do {
            ASN1Encodable aSN1Encodable = aSN1EncodableArr[i16];
            if (aSN1Encodable == null) {
                throw new NullPointerException(str);
            }
            this.elements[this.elementCount + i16] = aSN1Encodable;
            i16++;
        } while (i16 < length);
        this.elementCount = i15;
    }

    private void reallocate(int i15) {
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[Math.max(this.elements.length, i15 + (i15 >> 1))];
        System.arraycopy(this.elements, 0, aSN1EncodableArr, 0, this.elementCount);
        this.elements = aSN1EncodableArr;
        this.copyOnWrite = false;
    }

    public void add(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.elements.length;
        int i15 = this.elementCount + 1;
        if (this.copyOnWrite | (i15 > length)) {
            reallocate(i15);
        }
        this.elements[this.elementCount] = aSN1Encodable;
        this.elementCount = i15;
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector == null) {
            throw new NullPointerException("'other' cannot be null");
        }
        doAddAll(aSN1EncodableVector.elements, "'other' elements cannot be null");
    }

    public void addOptional(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            add(aSN1Encodable);
        }
    }

    ASN1Encodable[] copyElements() {
        int i15 = this.elementCount;
        if (i15 == 0) {
            return EMPTY_ELEMENTS;
        }
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[i15];
        System.arraycopy(this.elements, 0, aSN1EncodableArr, 0, i15);
        return aSN1EncodableArr;
    }

    public ASN1Encodable get(int i15) {
        if (i15 < this.elementCount) {
            return this.elements[i15];
        }
        throw new ArrayIndexOutOfBoundsException(i15 + " >= " + this.elementCount);
    }

    public int size() {
        return this.elementCount;
    }

    ASN1Encodable[] takeElements() {
        int i15 = this.elementCount;
        if (i15 == 0) {
            return EMPTY_ELEMENTS;
        }
        ASN1Encodable[] aSN1EncodableArr = this.elements;
        if (aSN1EncodableArr.length == i15) {
            this.copyOnWrite = true;
            return aSN1EncodableArr;
        }
        ASN1Encodable[] aSN1EncodableArr2 = new ASN1Encodable[i15];
        System.arraycopy(aSN1EncodableArr, 0, aSN1EncodableArr2, 0, i15);
        return aSN1EncodableArr2;
    }

    public ASN1EncodableVector(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.elements = i15 == 0 ? EMPTY_ELEMENTS : new ASN1Encodable[i15];
        this.elementCount = 0;
        this.copyOnWrite = false;
    }

    public void addAll(ASN1Encodable[] aSN1EncodableArr) {
        if (aSN1EncodableArr == null) {
            throw new NullPointerException("'others' cannot be null");
        }
        doAddAll(aSN1EncodableArr, "'others' elements cannot be null");
    }
}
