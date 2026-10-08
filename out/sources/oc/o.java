package oc;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Loc/o;", "", "", "mimeType", "Lvv/g;", "source", "", "f", "(Ljava/lang/String;Lvv/g;)Z", "a", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f144545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f144542b = new o() { // from class: oc.l
        @Override // oc.o
        public final boolean f(String str, vv.g gVar) {
            return o.e(str, gVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f144543c = new o() { // from class: oc.m
        @Override // oc.o
        public final boolean f(String str, vv.g gVar) {
            return o.d(str, gVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f144544d = new o() { // from class: oc.n
        @Override // oc.o
        public final boolean f(String str, vv.g gVar) {
            return o.a(str, gVar);
        }
    };

    /* JADX INFO: renamed from: oc.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001R\u0017\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u0001¨\u0006\t"}, d2 = {"Loc/o$a;", "", "<init>", "()V", "Loc/o;", "IGNORE", "Loc/o;", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144545a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean a(String str, vv.g gVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean d(String str, vv.g gVar) {
        if (str != null) {
            return fr.t.c(str, "image/jpeg") || fr.t.c(str, "image/webp") || fr.t.c(str, "image/heic") || fr.t.c(str, "image/heif");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean e(String str, vv.g gVar) {
        return false;
    }

    boolean f(String mimeType, vv.g source);
}
