package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/g;", "Landroidx/compose/ui/platform/c;", "<init>", "()V", "", "index", "", "j", "(I)Z", "i", "current", "", "a", "(I)[I", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10510d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f10511e;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/g$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/g;", "a", "()Landroidx/compose/ui/platform/g;", "instance", "Landroidx/compose/ui/platform/g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final g a() {
            if (g.f10511e == null) {
                g.f10511e = new g(null);
            }
            return g.f10511e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ g(fr.k kVar) {
        this();
    }

    private final boolean i(int index) {
        if (index <= 0 || d().charAt(index - 1) == '\n') {
            return false;
        }
        return index == d().length() || d().charAt(index) == '\n';
    }

    private final boolean j(int index) {
        if (d().charAt(index) != '\n') {
            return index == 0 || d().charAt(index - 1) == '\n';
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.h
    public int[] a(int current) {
        int length = d().length();
        if (length <= 0 || current >= length) {
            return null;
        }
        if (current < 0) {
            current = 0;
        }
        while (current < length && d().charAt(current) == '\n' && !j(current)) {
            current++;
        }
        if (current >= length) {
            return null;
        }
        int i15 = current + 1;
        while (i15 < length && !i(i15)) {
            i15++;
        }
        return c(current, i15);
    }

    @Override // androidx.compose.ui.platform.h
    public int[] b(int current) {
        int length = d().length();
        if (length <= 0 || current <= 0) {
            return null;
        }
        if (current > length) {
            current = length;
        }
        while (current > 0 && d().charAt(current - 1) == '\n' && !i(current)) {
            current--;
        }
        if (current <= 0) {
            return null;
        }
        int i15 = current - 1;
        while (i15 > 0 && !j(i15)) {
            i15--;
        }
        return c(i15, current);
    }

    private g() {
    }
}
