package j61;

import fu.o;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lj61/d;", "", "<init>", "()V", "Lfu/o;", "b", "Loq/k;", "c", "()Lfu/o;", "namesPattern", "d", "unicodeLettersDigitsWithSpacesDashDotCommaRegex", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f99769a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final k namesPattern = l.a(new er.a() { // from class: j61.b
        @Override // er.a
        public final Object a() {
            return d.e();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final k unicodeLettersDigitsWithSpacesDashDotCommaRegex = l.a(new er.a() { // from class: j61.c
        @Override // er.a
        public final Object a() {
            return d.f();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99772d = 8;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o e() {
        return new o("^[\\p{L}\\d \\-.]+$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o f() {
        return new o("^[\\p{L}\\d ,\\-.]+$");
    }

    public final o c() {
        return (o) namesPattern.getValue();
    }

    public final o d() {
        return (o) unicodeLettersDigitsWithSpacesDashDotCommaRegex.getValue();
    }
}
