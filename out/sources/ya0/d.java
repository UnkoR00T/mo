package ya0;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import xa0.State;
import xw.f;
import za0.SchoolInfoSectionData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lya0/d;", "Lxw/f;", "Lya0/d$a;", "Lxa0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Loq/i0;", "onClick", "", "iconResId", "Ln50/g;", "h", "(Lmx/a;Ler/a;I)Ln50/g;", "params", "i", "(Lya0/d$a;)Lxa0/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, xa0.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ya0.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lya0/d$a;", "", "Lxa0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "gradesAction", "scheduleAction", "attendanceAction", "behaviorAction", "<init>", "(Lxa0/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxa0/b;", "e", "()Lxa0/b;", "b", "Ler/a;", "c", "()Ler/a;", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> gradesAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> scheduleAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> attendanceAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> behaviorAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.gradesAction = aVar;
            this.scheduleAction = aVar2;
            this.attendanceAction = aVar3;
            this.behaviorAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.attendanceAction;
        }

        public final er.a<i0> b() {
            return this.behaviorAction;
        }

        public final er.a<i0> c() {
            return this.gradesAction;
        }

        public final er.a<i0> d() {
            return this.scheduleAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.gradesAction, params.gradesAction) && t.c(this.scheduleAction, params.scheduleAction) && t.c(this.attendanceAction, params.attendanceAction) && t.c(this.behaviorAction, params.behaviorAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.gradesAction.hashCode()) * 31) + this.scheduleAction.hashCode()) * 31) + this.attendanceAction.hashCode()) * 31) + this.behaviorAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", gradesAction=" + this.gradesAction + ", scheduleAction=" + this.scheduleAction + ", attendanceAction=" + this.attendanceAction + ", behaviorAction=" + this.behaviorAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData h(Label label, er.a<i0> onClick, int iconResId) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(iconResId, null, null, null, null, 30, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public xa0.c.Data b(Params params) {
        SchoolInfoSectionData schoolInfoSectionData;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: ya0.a
            @Override // er.a
            public final Object a() {
                return d.l();
            }
        }), this.labelProvider.c(ia0.a.f90652w), null, null, false, null, 60, null), null, null, null, null, 60, null);
        CardListData cardListData = new CardListData(v.q(h(this.labelProvider.c(ia0.a.f90642r), params.c(), jz.a.J0), h(this.labelProvider.c(ia0.a.f90640q), params.d(), jz.a.f106759e), h(this.labelProvider.c(ia0.a.f90644s), params.a(), jz.a.E0), h(this.labelProvider.c(ia0.a.f90638p), params.b(), jz.a.f106761e1)), null, false, null, null, 30, null);
        if (params.getState().getIsSchoolInfoFlagEnabled()) {
            schoolInfoSectionData = new SchoolInfoSectionData(this.labelProvider.c(ia0.a.f90650v), new CardListData(v.q(h(this.labelProvider.c(ia0.a.f90648u), new er.a() { // from class: ya0.b
                @Override // er.a
                public final Object a() {
                    return d.m();
                }
            }, jz.a.G0), h(this.labelProvider.c(ia0.a.f90646t), new er.a() { // from class: ya0.c
                @Override // er.a
                public final Object a() {
                    return d.q();
                }
            }, jz.a.X0)), null, false, null, null, 30, null));
        } else {
            schoolInfoSectionData = null;
        }
        return new xa0.c.Data(baseScaffoldData, cardListData, schoolInfoSectionData);
    }
}
