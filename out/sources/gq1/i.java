package gq1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import s70.IllustrationPageContentData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgq1/i;", "Lxw/f;", "Lgq1/i$a;", "Lgq1/t$a;", "<init>", "()V", "params", "l", "(Lgq1/i$a;)Lgq1/t$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, t.Initialized> {

    /* JADX INFO: renamed from: gq1.i$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgq1/i$a;", "", "Ls70/l;", "illustrationPageVMS", "Lgq1/s;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ls70/l;Lgq1/s;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls70/l;", "()Ls70/l;", "b", "Lgq1/s;", "c", "()Lgq1/s;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s70.l illustrationPageVMS;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Params(s70.l lVar, State state, er.a<i0> aVar) {
            this.illustrationPageVMS = lVar;
            this.state = state;
            this.onBackClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final s70.l getIllustrationPageVMS() {
            return this.illustrationPageVMS;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
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
            return fr.t.c(this.illustrationPageVMS, params.illustrationPageVMS) && fr.t.c(this.state, params.state) && fr.t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (((this.illustrationPageVMS.hashCode() * 31) + this.state.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(illustrationPageVMS=" + this.illustrationPageVMS + ", state=" + this.state + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.getIllustrationPageVMS().next();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.getIllustrationPageVMS().previous();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.getIllustrationPageVMS().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.getIllustrationPageVMS().previous();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t.Initialized b(final Params params) {
        IllustrationPageContentData illustrationPageContentData;
        ButtonData buttonData;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), mx.b.b("Illustration Page 1.1.0 (unmapped)", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        IllustrationPageContentData illustrationPageContentData2 = new IllustrationPageContentData(c20.b.H, mx.b.b("Podpisuj dokumenty elektronicznie " + params.getState().getCurrentIndex(), ""), mx.b.b("Zrobisz to na swoim telefonie, jo na swoim telefonie, jeśli masz funeśli masz funkcję NFC i dowód osobisty z warstwą elektroniczną.", ""), j.b());
        Label labelB = mx.b.b("Podpisuj dokumenty elektronicznie " + params.getState().getCurrentIndex(), "");
        Label labelB2 = mx.b.b("Zrobisz to na swoim telefonie, jeśli masz funkcję NFC i dowód osobisty z warstwą elektroniczną.", "");
        int i15 = c20.b.H;
        k30.b.c cVar = k30.b.c.f107768a;
        k30.a.b bVar = k30.a.b.f107765a;
        k30.c.WithText withText = new k30.c.WithText(mx.b.b("Test", ""), null, 2, null);
        k30.d.a aVar = k30.d.a.f107773a;
        IllustrationPageContentData illustrationPageContentData3 = new IllustrationPageContentData(i15, labelB, labelB2, new ButtonData(null, null, bVar, withText, aVar, cVar, new er.a() { // from class: gq1.d
            @Override // er.a
            public final Object a() {
                return i.m();
            }
        }, 3, null));
        IllustrationPageContentData illustrationPageContentData4 = new IllustrationPageContentData(c20.b.H, mx.b.b("Podpisuj dokumenty elektronicznie " + params.getState().getCurrentIndex(), ""), mx.b.b("Zrobisz to na swoim telefonie, jeśli masz funkcję NFC i dowód osobisty z warstwą elektroniczną.", ""), null);
        if (params.getIllustrationPageVMS().d()) {
            illustrationPageContentData = illustrationPageContentData3;
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Wróć", ""), null, 2, null), aVar, cVar, new er.a() { // from class: gq1.f
                @Override // er.a
                public final Object a() {
                    return i.r(params);
                }
            }, 3, null);
        } else {
            illustrationPageContentData = illustrationPageContentData3;
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Dalej", ""), null, 2, null), aVar, cVar, new er.a() { // from class: gq1.e
                @Override // er.a
                public final Object a() {
                    return i.q(params);
                }
            }, 3, null);
        }
        return new t.Initialized(baseScaffoldData, illustrationPageContentData2, illustrationPageContentData, illustrationPageContentData4, buttonData, !params.getIllustrationPageVMS().d() ? new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Pomiń", ""), null, 2, null), aVar, cVar, new er.a() { // from class: gq1.g
            @Override // er.a
            public final Object a() {
                return i.s(params);
            }
        }, 3, null) : new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Wróć", ""), null, 2, null), aVar, cVar, new er.a() { // from class: gq1.h
            @Override // er.a
            public final Object a() {
                return i.u(params);
            }
        }, 3, null), params.getIllustrationPageVMS());
    }
}
