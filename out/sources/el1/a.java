package el1;

import cl1.Error;
import cl1.Loading;
import cl1.k;
import cl1.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import il0.BeChildAndParentsData;
import iy.b0;
import iy.c0;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lel1/a;", "Lxw/f;", "Lel1/a$a;", "Lcl1/l$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Liy/b0;", "", "tag", "Lmx/a;", "i", "(Liy/b0;Ljava/lang/String;)Lmx/a;", AnnotatedPrivateKey.LABEL, "", "infoResId", "Ln50/g;", "c", "(Lmx/a;I)Ln50/g;", "params", "h", "(Lel1/a$a;)Lcl1/l$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lil0/a$a;", "", "e", "(Lil0/a$a;)Ljava/util/List;", "cards", "Lil0/a$b;", "f", "(Lil0/a$b;)Ljava/util/List;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, l.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: el1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lel1/a$a;", "", "Lcl1/k;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "closeAction", "nextAction", "<init>", "(Lcl1/k;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcl1/k;", "d", "()Lcl1/k;", "b", "Ler/a;", "()Ler/a;", "c", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        public Params(k kVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = kVar;
            this.backAction = aVar;
            this.closeAction = aVar2;
            this.nextAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final k getState() {
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.nextAction, params.nextAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    public a(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final DefaultSingleCardData c(Label label, int infoResId) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(infoResId), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final List<DefaultSingleCardData> e(BeChildAndParentsData.ChildData childData) {
        return v.q(c(i(childData.getFirstName(), "firstName"), gk1.a.F), c(i(childData.getSecondName(), "secondName"), gk1.a.f73420a0), c(i(childData.getLastName(), "lastName"), gk1.a.P), c(i(childData.getFamilyName(), "familyName"), gk1.a.D), c(mx.b.d(childData.getBirthPlace(), "birthPlace"), gk1.a.f73421b), c(mx.b.d(this.dateFormatter.d(childData.getBirthDate(), fz.c.DOTTED), "birthDate"), gk1.a.f73419a), c(i(childData.getIdSeriesAndNumber(), "idSeriesAndNumber"), gk1.a.M));
    }

    private final List<DefaultSingleCardData> f(BeChildAndParentsData.ParentsData parentsData) {
        return v.q(c(i(parentsData.getFathersName(), "fathersName"), gk1.a.E), c(i(parentsData.getMothersName(), "mothersName"), gk1.a.R), c(i(parentsData.getMothersMaidenName(), "mothersMaidenName"), gk1.a.Q));
    }

    private final Label i(b0 b0Var, String str) {
        return mx.b.d(b0Var != null ? c0.e(b0Var) : null, str);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l.a b(Params params) {
        k state = params.getState();
        if (state instanceof Loading) {
            return l.a.c.f28109a;
        }
        if (state instanceof Error) {
            return new l.a.Error(((Error) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof k.Initialized)) {
            throw new p();
        }
        return new l.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gk1.a.f73450p0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(gk1.a.f73448o0), new l.a.Initialized.Section(this.labelProvider.c(gk1.a.f73429f), new CardListData(e(((k.Initialized) params.getState()).getData().getChildData()), null, false, null, null, 30, null)), new l.a.Initialized.Section(this.labelProvider.c(gk1.a.f73431g), new CardListData(f(((k.Initialized) params.getState()).getData().getParentsData()), null, false, null, null, 30, null)), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gk1.a.S), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
