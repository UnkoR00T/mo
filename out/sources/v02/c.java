package v02;

import fu.o;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lv02/c;", "", "<init>", "()V", "Lfu/o;", "b", "Loq/k;", "f", "()Lfu/o;", "edorAddress", "c", "e", "advancedSearchNamesPattern", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f202962a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final k edorAddress = l.a(new er.a() { // from class: v02.a
        @Override // er.a
        public final Object a() {
            return c.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final k advancedSearchNamesPattern = l.a(new er.a() { // from class: v02.b
        @Override // er.a
        public final Object a() {
            return c.c();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f202965d = 8;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o c() {
        return new o("^[\\p{L}\\d \\-.]+$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o d() {
        return new o("[^{}<>$&%#@\"']*$");
    }

    public final o e() {
        return (o) advancedSearchNamesPattern.getValue();
    }

    public final o f() {
        return (o) edorAddress.getValue();
    }
}
