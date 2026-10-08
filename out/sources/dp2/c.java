package dp2;

import fu.o;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Ldp2/c;", "", "<init>", "()V", "Lfu/o;", "b", "Loq/k;", "()Lfu/o;", "namesPattern", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f43694a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final k namesPattern = l.a(new er.a() { // from class: dp2.b
        @Override // er.a
        public final Object a() {
            return c.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43696c = 8;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o c() {
        return new o("^[\\p{L}\\d \\-.]+$");
    }

    public final o b() {
        return (o) namesPattern.getValue();
    }
}
