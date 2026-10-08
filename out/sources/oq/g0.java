package oq;

import org.bouncycastle.crypto.hpke.HPKE;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Loq/g0;", "", "", "data", "e", "(S)S", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "k", "(S)Ljava/lang/String;", "a", ip.a.f96137b, "getData$annotations", "()V", "b", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements Comparable<g0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final short data;

    /* JADX INFO: renamed from: oq.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Loq/g0$a;", "", "<init>", "()V", "Loq/g0;", "MIN_VALUE", ip.a.f96137b, "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ g0(short s15) {
        this.data = s15;
    }

    public static final /* synthetic */ g0 b(short s15) {
        return new g0(s15);
    }

    public static short e(short s15) {
        return s15;
    }

    public static boolean g(short s15, Object obj) {
        return (obj instanceof g0) && s15 == ((g0) obj).getData();
    }

    public static int j(short s15) {
        return Short.hashCode(s15);
    }

    public static String k(short s15) {
        return String.valueOf(s15 & HPKE.aead_EXPORT_ONLY);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(g0 g0Var) {
        return fr.t.d(getData() & HPKE.aead_EXPORT_ONLY, g0Var.getData() & HPKE.aead_EXPORT_ONLY);
    }

    public boolean equals(Object other) {
        return g(this.data, other);
    }

    public int hashCode() {
        return j(this.data);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    public String toString() {
        return k(this.data);
    }
}
