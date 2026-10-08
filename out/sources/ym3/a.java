package ym3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lym3/a;", "", "<init>", "()V", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lmx/c;", "labelProvider", "Ltn3/e;", "Ldn3/a$b;", "d", "(Lez/a;Lez/e;Lez/c;Lmx/c;)Ltn3/e;", "Ltn3/a;", "insurancePicker", "Ldn3/a$a;", "c", "(Lez/a;Lez/e;Lez/c;Lmx/c;Ltn3/a;)Ltn3/e;", "b", "(Lez/a;)Ltn3/a;", "Lxm3/a;", "a", "()Lxm3/a;", "Lvm3/a;", "e", "()Lvm3/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final xm3.a a() {
        return new cn3.b();
    }

    public final tn3.a b(ez.a currentTimeProvider) {
        return new tn3.b(currentTimeProvider);
    }

    public final tn3.e<dn3.a.Insurance> c(ez.a currentTimeProvider, ez.e dateFormatter, ez.c dateConverter, mx.c labelProvider, tn3.a insurancePicker) {
        return new tn3.c(currentTimeProvider, dateFormatter, dateConverter, labelProvider, insurancePicker);
    }

    public final tn3.e<dn3.a.TechnicalExamination> d(ez.a currentTimeProvider, ez.e dateFormatter, ez.c dateConverter, mx.c labelProvider) {
        return new tn3.d(currentTimeProvider, dateFormatter, dateConverter, labelProvider);
    }

    public final vm3.a e() {
        return new an3.b();
    }
}
