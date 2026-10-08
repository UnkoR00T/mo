package l3;

import androidx.compose.ui.platform.g1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\f"}, d2 = {"Ll3/t0;", "", "", "value", "e", "(I)I", "Lg4/e;", "node", "", "d", "(ILg4/e;)Z", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f115630b = e(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f115631c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f115632d = e(2);

    /* JADX INFO: renamed from: l3.t0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Ll3/t0$a;", "", "<init>", "()V", "Ll3/t0;", "Always", "I", "a", "()I", "SystemDefined", "c", "Never", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return t0.f115630b;
        }

        public final int b() {
            return t0.f115632d;
        }

        public final int c() {
            return t0.f115631c;
        }

        private Companion() {
        }
    }

    public static final boolean d(int i15, g4.e eVar) {
        if (f(i15, f115630b)) {
            return true;
        }
        if (f(i15, f115631c)) {
            return !w3.a.f(((w3.c) g4.f.a(eVar, g1.k())).a(), w3.a.INSTANCE.b());
        }
        if (f(i15, f115632d)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    private static int e(int i15) {
        return i15;
    }

    public static final boolean f(int i15, int i16) {
        return i15 == i16;
    }
}
