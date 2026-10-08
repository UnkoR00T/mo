package zz1;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import un0.ElectionSupportsHistoryGrantedSupport;
import un0.e;
import un0.i;
import un0.j;
import x50.NavigationButtonData;
import xw.f;
import yz1.State;
import yz1.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzz1/b;", "Lxw/f;", "Lzz1/b$a;", "Lyz1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lun0/l;", "Lkotlin/Function1;", "Loq/i0;", "onItemClick", "Ln50/g;", "e", "(Lun0/l;Ler/l;)Ln50/g;", "Lun0/i;", "Lr50/a$b;", "i", "(Lun0/i;)Lr50/a$b;", "params", "h", "(Lzz1/b$a;)Lyz1/c$a;", "a", "Lmx/c;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: zz1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lzz1/b$a;", "", "Lyz1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lun0/l;", "onActionSelect", "<init>", "(Lyz1/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyz1/b;", "c", "()Lyz1/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ElectionSupportsHistoryGrantedSupport, i0> onActionSelect;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super ElectionSupportsHistoryGrantedSupport, i0> lVar) {
            this.state = state;
            this.onBackAction = aVar;
            this.onActionSelect = lVar;
        }

        public final l<ElectionSupportsHistoryGrantedSupport, i0> a() {
            return this.onActionSelect;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onActionSelect, params.onActionSelect);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onActionSelect.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onActionSelect=" + this.onActionSelect + ')';
        }
    }

    /* JADX INFO: renamed from: zz1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6450b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f238574b;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.CANDIDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f238573a = iArr;
            int[] iArr2 = new int[i.values().length];
            try {
                iArr2[i.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[i.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f238574b = iArr2;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData e(final ElectionSupportsHistoryGrantedSupport electionSupportsHistoryGrantedSupport, final l<? super ElectionSupportsHistoryGrantedSupport, i0> lVar) {
        Label labelB;
        w0.StatusBadge statusBadge = new w0.StatusBadge(i(electionSupportsHistoryGrantedSupport.getStatus()));
        SingleCardLabel singleCardLabelB = n50.l.b(mx.b.b(electionSupportsHistoryGrantedSupport.getElectoralDistrictName(), "electoralDistrictName"), null, null, 3, null);
        int i15 = C6450b.f238573a[electionSupportsHistoryGrantedSupport.getSubjectType().ordinal()];
        if (i15 == 1) {
            labelB = mx.b.b(electionSupportsHistoryGrantedSupport.getSubjectName(), "subjectName");
        } else if (i15 == 2) {
            labelB = mx.b.b(electionSupportsHistoryGrantedSupport.getCommitteeName(), "committeeName");
        } else {
            if (i15 != 3) {
                throw new p();
            }
            labelB = Label.INSTANCE.c();
        }
        j70.a aVar = j70.a.NORMAL;
        return new DefaultSingleCardData(null, new er.a() { // from class: zz1.a
            @Override // er.a
            public final Object a() {
                return b.f(lVar, electionSupportsHistoryGrantedSupport);
            }
        }, false, null, null, false, null, statusBadge, new BodySection(singleCardLabelB, new n50.b.Title(n50.l.b(labelB, aVar, null, 2, null)), (electionSupportsHistoryGrantedSupport.getActionType() == e.PRESIDENTIAL_ELECTION || electionSupportsHistoryGrantedSupport.getActionType() == e.SENATE_ELECTION || electionSupportsHistoryGrantedSupport.getActionType() == e.SENATE_SUPPLEMENTARY_ELECTION) ? n50.l.b(mx.b.b(electionSupportsHistoryGrantedSupport.getCommitteeName(), "committeeName"), aVar, null, 2, null) : null), null, x0.Icon.INSTANCE.b(), null, 2685, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, ElectionSupportsHistoryGrantedSupport electionSupportsHistoryGrantedSupport) {
        lVar.b(electionSupportsHistoryGrantedSupport);
        return i0.f148189a;
    }

    private final r50.a.WithIcon i(i iVar) {
        Label labelC;
        g gVar;
        int[] iArr = C6450b.f238574b;
        int i15 = iArr[iVar.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(fz1.a.f68961m0);
        } else if (i15 != 2) {
            labelC = i15 != 3 ? Label.INSTANCE.c() : this.labelProvider.c(fz1.a.f68957k0);
        } else {
            labelC = this.labelProvider.c(fz1.a.f68963n0);
        }
        int i16 = iArr[iVar.ordinal()];
        if (i16 == 1) {
            gVar = g.INFORMATIVE;
        } else if (i16 != 2) {
            gVar = i16 != 3 ? g.MINUS : g.POSITIVE;
        } else {
            gVar = g.NEGATIVE;
        }
        return new r50.a.WithIcon(null, labelC, null, 0, false, gVar, 29, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(fz1.a.Q), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelB = mx.b.b(params.getState().getGrantedSupportsByAction().getActionName(), "actionName");
        List<ElectionSupportsHistoryGrantedSupport> listB = params.getState().getGrantedSupportsByAction().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(e((ElectionSupportsHistoryGrantedSupport) it.next(), params.a()));
        }
        return new c.Data(baseScaffoldData, labelB, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
