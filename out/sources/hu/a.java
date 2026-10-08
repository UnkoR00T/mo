package hu;

import fr.k;
import fu.r;
import java.io.Serializable;
import oq.d0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Lhu/a;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "e", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "(Lhu/a;)I", "hashCode", "()I", "a", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "c", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Comparable<a>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f86674d = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long mostSignificantBits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long leastSignificantBits;

    /* JADX INFO: renamed from: hu.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lhu/a$a;", "", "<init>", "()V", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    private a(long j15, long j16) {
        this.mostSignificantBits = j15;
        this.leastSignificantBits = j16;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        long j15 = this.mostSignificantBits;
        return j15 != other.mostSignificantBits ? Long.compareUnsigned(d0.e(j15), d0.e(other.mostSignificantBits)) : Long.compareUnsigned(d0.e(this.leastSignificantBits), d0.e(other.leastSignificantBits));
    }

    public final String e() {
        byte[] bArr = new byte[36];
        b.a(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        b.a(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        b.a(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        b.a(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        b.a(this.leastSignificantBits, bArr, 24, 2, 8);
        return r.A(bArr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.mostSignificantBits == aVar.mostSignificantBits && this.leastSignificantBits == aVar.leastSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public String toString() {
        return e();
    }
}
