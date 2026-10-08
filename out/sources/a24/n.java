package a24;

import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"La24/n;", "Lj14/i;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lj14/i$a;", "params", "Lhz/g;", "d", "(Lj14/i$a;)Lhz/g;", "a", "Lmx/c;", "b", "Lhz/i;", "Lhz/h;", "c", "Loq/k;", "()Lhz/h;", "textValidator", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements j14.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f2239d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.i validatorTextFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k textValidator = oq.l.a(new er.a() { // from class: a24.m
        @Override // er.a
        public final Object a() {
            return n.e(this.f2238a);
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La24/n$a;", "", "<init>", "()V", "", "MAX_LENGTH", "I", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public n(mx.c cVar, hz.i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final hz.h c() {
        return (hz.h) this.textValidator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h e(n nVar) {
        return nVar.validatorTextFactory.a();
    }

    @Override // gz.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public hz.g a(j14.i.Params params) {
        mx.c cVar = this.labelProvider;
        hz.h hVarY = c().M(cVar.c(s04.b.f177210h1)).y(120, cVar.e(s04.b.f177219k1, 120));
        hVarY.g(new a24.a(cVar.c(s04.b.f177240r1), "^[ '\\-\\p{L}]*$"));
        return hVarY.a(c0.e(params.getMothersName()));
    }
}
