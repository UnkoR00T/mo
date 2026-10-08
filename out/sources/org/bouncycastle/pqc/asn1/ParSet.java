package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ParSet extends ASN1Object {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f149416h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f149417k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f149418t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f149419w;

    public ParSet(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f149418t = i15;
        this.f149416h = iArr;
        this.f149419w = iArr2;
        this.f149417k = iArr3;
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int iIntValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (iIntValueExact > 0) {
            return iIntValueExact;
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + iIntValueExact);
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f149416h);
    }

    public int[] getK() {
        return Arrays.clone(this.f149417k);
    }

    public int getT() {
        return this.f149418t;
    }

    public int[] getW() {
        return Arrays.clone(this.f149419w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i15 = 0; i15 < this.f149416h.length; i15++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f149416h[i15]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f149419w[i15]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f149417k[i15]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f149418t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException("sie of seqOfParams = " + aSN1Sequence.size());
        }
        this.f149418t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f149418t || aSN1Sequence3.size() != this.f149418t || aSN1Sequence4.size() != this.f149418t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f149416h = new int[aSN1Sequence2.size()];
        this.f149419w = new int[aSN1Sequence3.size()];
        this.f149417k = new int[aSN1Sequence4.size()];
        for (int i15 = 0; i15 < this.f149418t; i15++) {
            this.f149416h[i15] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i15));
            this.f149419w[i15] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i15));
            this.f149417k[i15] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i15));
        }
    }
}
