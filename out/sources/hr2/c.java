package hr2;

import al0.o0;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import q40.j;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhr2/c;", "Lxw/f;", "Lhr2/c$a;", "Lfr2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lhr2/c$a;)Lfr2/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, fr2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: hr2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lhr2/c$a;", "", "Lfr2/b;", "state", "Lkotlin/Function1;", "Lal0/o0;", "Loq/i0;", "onReasonChosen", "Lkotlin/Function0;", "onBack", "<init>", "(Lfr2/b;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfr2/b;", "c", "()Lfr2/b;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fr2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<o0, i0> onReasonChosen;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(fr2.b bVar, l<? super o0, i0> lVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onReasonChosen = lVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<o0, i0> b() {
            return this.onReasonChosen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fr2.b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onReasonChosen, params.onReasonChosen) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onReasonChosen.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onReasonChosen=" + this.onReasonChosen + ", onBack=" + this.onBack + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.b().b(o0.Damage);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.b().b(o0.Lost);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public fr2.c.a b(final Params params) {
        mx.c cVar = this.labelProvider;
        fr2.b state = params.getState();
        if (state instanceof fr2.b.C1480b) {
            return fr2.c.a.b.f66502a;
        }
        if (state instanceof fr2.b.a) {
            return new fr2.c.a.Empty(new IconPageData(new j.a(jz.a.f106807k2), cVar.c(qq2.a.f168134y), null, null, null, null, false, 76, null));
        }
        if (!(state instanceof fr2.b.c)) {
            return fr2.c.a.b.f66502a;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
        Label labelC = cVar.c(qq2.a.f168126q);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(qq2.a.S), null, null, 0, 0, null, 62, null)), null, 5, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new fr2.c.a.Initialized(baseScaffoldData, labelC, new DefaultSingleCardData(null, new er.a() { // from class: hr2.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, false, null, null, false, null, null, bodySection, null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, new er.a() { // from class: hr2.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(qq2.a.T), null, null, 0, 0, null, 62, null)), null, 5, null), null, companion.b(), null, 2813, null), params.a());
    }
}
