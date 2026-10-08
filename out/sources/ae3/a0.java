package ae3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lfu/o;", "a", "Loq/k;", "d", "()Lfu/o;", "alphanumericRegex", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final oq.k f5646a = oq.l.a(new er.a() { // from class: ae3.z
        @Override // er.a
        public final Object a() {
            return a0.c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final fu.o c() {
        return new fu.o("^[\\p{L}0-9.,?!:;()\" \\-]*$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fu.o d() {
        return (fu.o) f5646a.getValue();
    }
}
