package a24;

import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"La24/t;", "Lj14/o;", "Lmx/c;", "labelProvider", "Lhz/h;", "validatorText", "<init>", "(Lmx/c;Lhz/h;)V", "Lj14/o$a;", "params", "Lhz/g;", "b", "(Lj14/o$a;)Lhz/g;", "a", "Lmx/c;", "Lhz/h;", "c", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements j14.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h validatorText;

    public t(mx.c cVar, hz.h hVar) {
        this.labelProvider = cVar;
        this.validatorText = hVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public hz.g a(j14.o.Params params) {
        String strE = c0.e(params.getPostalCode());
        if (strE.length() == 0 && !params.getIsRequired()) {
            return hz.g.b.f86853b;
        }
        this.validatorText.L(this.labelProvider.c(s04.b.K1)).v(this.labelProvider.c(s04.b.A1)).y(6, this.labelProvider.c(s04.b.N1)).h(this.labelProvider.c(s04.b.L1));
        return this.validatorText.a(strE);
    }
}
