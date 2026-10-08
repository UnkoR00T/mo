package ub3;

import dz.e;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.d;
import n50.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import sb3.Error;
import sb3.g;
import vb3.ParticipantUIData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0012\u001a\u00020\u0011*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lub3/b;", "Lxw/f;", "Lub3/b$a;", "Lsb3/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lvb3/c;", "Lmx/a;", "title", "Lkotlin/Function1;", "Lxw/g;", "Loq/i0;", "onClick", "Ln50/j0;", "singleCardState", "Ln50/g;", "f", "(Lvb3/c;Lmx/a;Ler/l;Ln50/j0;)Ln50/g;", "Lhz/b;", "l", "(Lhz/b;)Ln50/j0;", "params", "e", "(Lub3/b$a;)Lsb3/g$a;", "a", "Lmx/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ub3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010 R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001e\u0010&¨\u0006'"}, d2 = {"Lub3/b$a;", "", "Lsb3/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "onNext", "onScrolledToError", "onUserParticipantClick", "Lkotlin/Function1;", "Lxw/g;", "onChildParticipantClick", "<init>", "(Lsb3/f;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsb3/f;", "g", "()Lsb3/f;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "f", "Ler/l;", "()Ler/l;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sb3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUserParticipantClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<xw.g, i0> onChildParticipantClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(sb3.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super xw.g, i0> lVar) {
            this.state = fVar;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onNext = aVar3;
            this.onScrolledToError = aVar4;
            this.onUserParticipantClick = aVar5;
            this.onChildParticipantClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<xw.g, i0> b() {
            return this.onChildParticipantClick;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final er.a<i0> d() {
            return this.onNext;
        }

        public final er.a<i0> e() {
            return this.onScrolledToError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext) && t.c(this.onScrolledToError, params.onScrolledToError) && t.c(this.onUserParticipantClick, params.onUserParticipantClick) && t.c(this.onChildParticipantClick, params.onChildParticipantClick);
        }

        public final er.a<i0> f() {
            return this.onUserParticipantClick;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final sb3.f getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onScrolledToError.hashCode()) * 31) + this.onUserParticipantClick.hashCode()) * 31) + this.onChildParticipantClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ", onScrolledToError=" + this.onScrolledToError + ", onUserParticipantClick=" + this.onUserParticipantClick + ", onChildParticipantClick=" + this.onChildParticipantClick + ')';
        }
    }

    /* JADX INFO: renamed from: ub3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5131b implements l<xw.g, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Params f197417a;

        C5131b(Params params) {
            this.f197417a = params;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(xw.g gVar) {
            c(gVar.getValue());
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            this.f197417a.f().a();
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData f(final ParticipantUIData participantUIData, Label label, final l<? super xw.g, i0> lVar, j0 j0Var) {
        LeadingSection leadingSection = new LeadingSection(false, new d.CheckBox(participantUIData.getIsChecked()), null, 5, null);
        return new DefaultSingleCardData(null, new er.a() { // from class: ub3.a
            @Override // er.a
            public final Object a() {
                return b.i(lVar, participantUIData);
            }
        }, false, j0Var, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.e(r93.a.K, c0.e(participantUIData.getData().getPesel())), this.labelProvider.e(r93.a.K, e.h(c0.e(participantUIData.getData().getPesel()), 1, Label.INSTANCE.d())), null, 0, 0, null, 60, null), 1, null), leadingSection, null, null, 3317, null);
    }

    static /* synthetic */ DefaultSingleCardData h(b bVar, ParticipantUIData participantUIData, Label label, l lVar, j0 j0Var, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            j0Var = j0.a.f132074a;
        }
        return bVar.f(participantUIData, label, lVar, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, ParticipantUIData participantUIData) {
        lVar.b(xw.g.b(participantUIData.getData().getPesel()));
        return i0.f148189a;
    }

    private final j0 l(hz.b bVar) {
        if (bVar instanceof hz.b.Invalid) {
            return new j0.Error(this.labelProvider.c(r93.a.f172472e1));
        }
        if (t.c(bVar, hz.b.C2039b.f86846c) || t.c(bVar, hz.b.d.f86848c)) {
            return j0.a.f132074a;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        sb3.f state = params.getState();
        if (t.c(state, sb3.e.f179919a)) {
            return g.a.c.f179937a;
        }
        if (state instanceof Error) {
            return new g.a.Error(((Error) params.getState()).getErrorVMS());
        }
        if (!(state instanceof sb3.f.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.f172475f1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(r93.a.f172469d1);
        Label labelC2 = this.labelProvider.c(r93.a.f172466c1);
        DefaultSingleCardData defaultSingleCardDataF = f(((sb3.f.Initialized) params.getState()).getUserData(), this.labelProvider.e(r93.a.I, ((sb3.f.Initialized) params.getState()).getUserData().getData().b()).n("nameAndSurname"), new C5131b(params), l(((sb3.f.Initialized) params.getState()).getValidationState()));
        Label labelC3 = this.labelProvider.c(r93.a.f172478g1);
        j0 j0VarL = l(((sb3.f.Initialized) params.getState()).getValidationState());
        List<ParticipantUIData> listC = ((sb3.f.Initialized) params.getState()).c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        boolean z15 = false;
        int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            ParticipantUIData participantUIData = (ParticipantUIData) obj;
            arrayList.add(h(this, participantUIData, mx.b.b(participantUIData.getData().b(), "childNameAndSurname_" + i15), params.b(), null, 4, null));
            z15 = z15;
            i15 = i16;
            baseScaffoldData = baseScaffoldData;
        }
        return new g.a.Initialized(baseScaffoldData, labelC, labelC2, defaultSingleCardDataF, labelC3, new CardListData(arrayList, j0VarL, false, null, null, 28, null), new c30.b.c(null, null, null, this.labelProvider.c(r93.a.f172463b1), null, null, null, 119, null), new ButtonData(null, null, new k30.a.Large(z15, 1, null), new k30.c.WithText(this.labelProvider.c(r93.a.E), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), ((sb3.f.Initialized) params.getState()).getScrollToError(), params.e());
    }
}
