package pe1;

import a50.RadioButtonData;
import androidx.compose.ui.graphics.Color;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import de1.SocialInsuranceQuestions;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oe1.State;
import oe1.n;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpe1/g;", "Lxw/f;", "Lpe1/g$a;", "Loe1/n$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "m", "(Lpe1/g$a;)Loe1/n$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, n.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: pe1.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001e\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, d2 = {"Lpe1/g$a;", "", "Loe1/m;", "state", "Lkotlin/Function1;", "Lde1/g;", "Loq/i0;", "onSelectFirstAnswer", "onSelectSecondAnswer", "onSelectThirdAnswer", "Lkotlin/Function0;", "nextAction", "backAction", "onCloseAction", "<init>", "(Loe1/m;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loe1/m;", "g", "()Loe1/m;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "f", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<de1.g, i0> onSelectFirstAnswer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<de1.g, i0> onSelectSecondAnswer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<de1.g, i0> onSelectThirdAnswer;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super de1.g, i0> lVar, l<? super de1.g, i0> lVar2, l<? super de1.g, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onSelectFirstAnswer = lVar;
            this.onSelectSecondAnswer = lVar2;
            this.onSelectThirdAnswer = lVar3;
            this.nextAction = aVar;
            this.backAction = aVar2;
            this.onCloseAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        public final l<de1.g, i0> d() {
            return this.onSelectFirstAnswer;
        }

        public final l<de1.g, i0> e() {
            return this.onSelectSecondAnswer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSelectFirstAnswer, params.onSelectFirstAnswer) && t.c(this.onSelectSecondAnswer, params.onSelectSecondAnswer) && t.c(this.onSelectThirdAnswer, params.onSelectThirdAnswer) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final l<de1.g, i0> f() {
            return this.onSelectThirdAnswer;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onSelectFirstAnswer.hashCode()) * 31) + this.onSelectSecondAnswer.hashCode()) * 31) + this.onSelectThirdAnswer.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectFirstAnswer=" + this.onSelectFirstAnswer + ", onSelectSecondAnswer=" + this.onSelectSecondAnswer + ", onSelectThirdAnswer=" + this.onSelectThirdAnswer + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157109a;

        static {
            int[] iArr = new int[de1.g.values().length];
            try {
                iArr[de1.g.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f157109a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f157110a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1709378531);
            if (p076m2.t.k()) {
                p076m2.t.o(1709378531, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.socialinsurancequestions.mapper.SocialInsuranceQuestionsMapper.invoke.<anonymous> (SocialInsuranceQuestionsMapper.kt:49)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.d().b(de1.g.YES);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.d().b(de1.g.NO);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.e().b(de1.g.YES);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.e().b(de1.g.NO);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.f().b(de1.g.YES);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.f().b(de1.g.NO);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public n.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f157110a, null, params.c(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer = params.getState().getSocialInsuranceQuestionsAnswer();
        de1.g firstAnswer = socialInsuranceQuestionsAnswer != null ? socialInsuranceQuestionsAnswer.getFirstAnswer() : null;
        de1.g gVar = de1.g.YES;
        RadioButtonRow radioButtonRow = new RadioButtonRow(new RadioButtonItemData(false, firstAnswer == gVar, false, 5, null), new er.a() { // from class: pe1.a
            @Override // er.a
            public final Object a() {
                return g.q(params);
            }
        }, this.labelProvider.c(ha1.a.f82508u0), null, null, 24, null);
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer2 = params.getState().getSocialInsuranceQuestionsAnswer();
        de1.g firstAnswer2 = socialInsuranceQuestionsAnswer2 != null ? socialInsuranceQuestionsAnswer2.getFirstAnswer() : null;
        de1.g gVar2 = de1.g.NO;
        List listQ = v.q(radioButtonRow, new RadioButtonRow(new RadioButtonItemData(false, firstAnswer2 == gVar2, false, 5, null), new er.a() { // from class: pe1.b
            @Override // er.a
            public final Object a() {
                return g.r(params);
            }
        }, this.labelProvider.c(ha1.a.Q), null, null, 24, null));
        b50.e.a aVar = b50.e.a.f16684a;
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer3 = params.getState().getSocialInsuranceQuestionsAnswer();
        de1.g firstAnswer3 = socialInsuranceQuestionsAnswer3 != null ? socialInsuranceQuestionsAnswer3.getFirstAnswer() : null;
        RadioButtonData radioButtonData = new RadioButtonData(listQ, aVar, (firstAnswer3 == null ? -1 : b.f157109a[firstAnswer3.ordinal()]) == 1 ? new b50.d.Error(this.labelProvider.c(ha1.a.f82426j)) : b50.d.c.f16683a, this.labelProvider.c(ha1.a.f82543z0), null, null, null, 112, null);
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer4 = params.getState().getSocialInsuranceQuestionsAnswer();
        RadioButtonRow radioButtonRow2 = new RadioButtonRow(new RadioButtonItemData(false, (socialInsuranceQuestionsAnswer4 != null ? socialInsuranceQuestionsAnswer4.getSecondAnswer() : null) == gVar, false, 5, null), new er.a() { // from class: pe1.c
            @Override // er.a
            public final Object a() {
                return g.s(params);
            }
        }, this.labelProvider.c(ha1.a.A0), null, null, 24, null);
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer5 = params.getState().getSocialInsuranceQuestionsAnswer();
        List listQ2 = v.q(radioButtonRow2, new RadioButtonRow(new RadioButtonItemData(false, (socialInsuranceQuestionsAnswer5 != null ? socialInsuranceQuestionsAnswer5.getSecondAnswer() : null) == gVar2, false, 5, null), new er.a() { // from class: pe1.d
            @Override // er.a
            public final Object a() {
                return g.u(params);
            }
        }, this.labelProvider.c(ha1.a.B0), null, null, 24, null));
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer6 = params.getState().getSocialInsuranceQuestionsAnswer();
        de1.g secondAnswer = socialInsuranceQuestionsAnswer6 != null ? socialInsuranceQuestionsAnswer6.getSecondAnswer() : null;
        RadioButtonData radioButtonData2 = new RadioButtonData(listQ2, aVar, (secondAnswer == null ? -1 : b.f157109a[secondAnswer.ordinal()]) == 1 ? new b50.d.Error(this.labelProvider.c(ha1.a.f82426j)) : b50.d.c.f16683a, this.labelProvider.c(ha1.a.C0), null, null, null, 112, null);
        Label labelC = this.labelProvider.c(ha1.a.E0);
        Label labelC2 = this.labelProvider.c(ha1.a.D0);
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer7 = params.getState().getSocialInsuranceQuestionsAnswer();
        RadioButtonRow radioButtonRow3 = new RadioButtonRow(new RadioButtonItemData(false, (socialInsuranceQuestionsAnswer7 != null ? socialInsuranceQuestionsAnswer7.getThirdAnswer() : null) == gVar, false, 5, null), new er.a() { // from class: pe1.e
            @Override // er.a
            public final Object a() {
                return g.v(params);
            }
        }, this.labelProvider.c(ha1.a.f82508u0), null, null, 24, null);
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer8 = params.getState().getSocialInsuranceQuestionsAnswer();
        List listQ3 = v.q(radioButtonRow3, new RadioButtonRow(new RadioButtonItemData(false, (socialInsuranceQuestionsAnswer8 != null ? socialInsuranceQuestionsAnswer8.getThirdAnswer() : null) == gVar2, false, 5, null), new er.a() { // from class: pe1.f
            @Override // er.a
            public final Object a() {
                return g.x(params);
            }
        }, this.labelProvider.c(ha1.a.Q), null, null, 24, null));
        SocialInsuranceQuestions socialInsuranceQuestionsAnswer9 = params.getState().getSocialInsuranceQuestionsAnswer();
        de1.g thirdAnswer = socialInsuranceQuestionsAnswer9 != null ? socialInsuranceQuestionsAnswer9.getThirdAnswer() : null;
        return new n.Data(baseScaffoldData, radioButtonData, radioButtonData2, labelC, labelC2, new RadioButtonData(listQ3, aVar, (thirdAnswer != null ? b.f157109a[thirdAnswer.ordinal()] : -1) == 1 ? new b50.d.Error(this.labelProvider.c(ha1.a.f82426j)) : b50.d.c.f16683a, null, null, null, null, 120, null), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
    }
}
