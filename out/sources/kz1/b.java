package kz1;

import er.l;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jz1.State;
import k40.EmptyStateData;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import un0.AvailableElectionSupport;
import un0.ElectionSupportCommitteeData;
import un0.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u000e*\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u001b*\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkz1/b;", "Lxw/f;", "Lkz1/b$a;", "Ljz1/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lun0/a;", "", "r", "(Lun0/a;)Z", "", "Lun0/g;", "", "query", "isCandidate", "i", "(Ljava/util/List;Ljava/lang/String;Z)Ljava/util/List;", "f", "(Lun0/g;Z)Ljava/lang/String;", "e", "h", "(Lun0/g;Z)Ljava/util/List;", "Lkotlin/Function1;", "Loq/i0;", "onItemClick", "Ln50/g;", "l", "(Lun0/g;ZLer/l;)Ln50/g;", "params", "q", "(Lkz1/b$a;)Ljz1/f$a;", "a", "Lmx/c;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, jz1.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: kz1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\u001a\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b&\u0010!R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\"\u0010%¨\u0006'"}, d2 = {"Lkz1/b$a;", "", "Ljz1/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onBackAction", "Lkotlin/Function1;", "", "onQueryChangedAction", "", "onActiveChangedAction", "onSearchClearAction", "Lun0/g;", "onCommitteeSelectAction", "<init>", "(Ljz1/e;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljz1/e;", "g", "()Ljz1/e;", "b", "Ler/a;", "c", "()Ler/a;", "d", "Ler/l;", "e", "()Ler/l;", "f", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onQueryChangedAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onActiveChangedAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSearchClearAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ElectionSupportCommitteeData, i0> onCommitteeSelectAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar3, l<? super ElectionSupportCommitteeData, i0> lVar3) {
            this.state = state;
            this.onCloseAction = aVar;
            this.onBackAction = aVar2;
            this.onQueryChangedAction = lVar;
            this.onActiveChangedAction = lVar2;
            this.onSearchClearAction = aVar3;
            this.onCommitteeSelectAction = lVar3;
        }

        public final l<Boolean, i0> a() {
            return this.onActiveChangedAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        public final l<ElectionSupportCommitteeData, i0> d() {
            return this.onCommitteeSelectAction;
        }

        public final l<String, i0> e() {
            return this.onQueryChangedAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onQueryChangedAction, params.onQueryChangedAction) && t.c(this.onActiveChangedAction, params.onActiveChangedAction) && t.c(this.onSearchClearAction, params.onSearchClearAction) && t.c(this.onCommitteeSelectAction, params.onCommitteeSelectAction);
        }

        public final er.a<i0> f() {
            return this.onSearchClearAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onQueryChangedAction.hashCode()) * 31) + this.onActiveChangedAction.hashCode()) * 31) + this.onSearchClearAction.hashCode()) * 31) + this.onCommitteeSelectAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onBackAction=" + this.onBackAction + ", onQueryChangedAction=" + this.onQueryChangedAction + ", onActiveChangedAction=" + this.onActiveChangedAction + ", onSearchClearAction=" + this.onSearchClearAction + ", onCommitteeSelectAction=" + this.onCommitteeSelectAction + ')';
        }
    }

    /* JADX INFO: renamed from: kz1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2756b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113484a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PRESIDENTIAL_ELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SENATE_ELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.SENATE_SUPPLEMENTARY_ELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f113484a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final String e(ElectionSupportCommitteeData electionSupportCommitteeData, boolean z15) {
        String committeeName = electionSupportCommitteeData.getCommitteeName();
        if (z15) {
            return committeeName;
        }
        return null;
    }

    private final String f(ElectionSupportCommitteeData electionSupportCommitteeData, boolean z15) {
        return z15 ? electionSupportCommitteeData.getCommitteeSubjectName() : electionSupportCommitteeData.getCommitteeName();
    }

    private final List<String> h(ElectionSupportCommitteeData electionSupportCommitteeData, boolean z15) {
        return v.s(f(electionSupportCommitteeData, z15), e(electionSupportCommitteeData, z15));
    }

    private final List<ElectionSupportCommitteeData> i(List<ElectionSupportCommitteeData> list, String str, boolean z15) {
        String lowerCase = r.u1(str).toString().toLowerCase(Locale.ROOT);
        if (lowerCase.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<String> listH = h((ElectionSupportCommitteeData) obj, z15);
            if (!(listH instanceof Collection) || !listH.isEmpty()) {
                Iterator<T> it = listH.iterator();
                while (it.hasNext()) {
                    if (r.d0(((String) it.next()).toLowerCase(Locale.ROOT), lowerCase, false, 2, null)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private final DefaultSingleCardData l(final ElectionSupportCommitteeData electionSupportCommitteeData, boolean z15, final l<? super ElectionSupportCommitteeData, i0> lVar) {
        Label labelB;
        String strF = f(electionSupportCommitteeData, z15);
        String str = "committe_" + strF;
        Label labelB2 = mx.b.b(strF, "");
        j70.a aVar = j70.a.NORMAL;
        SingleCardLabel singleCardLabelB = null;
        n50.b.Title title = new n50.b.Title(n50.l.b(labelB2, aVar, null, 2, null));
        String strE = e(electionSupportCommitteeData, z15);
        if (strE != null && (labelB = mx.b.b(strE, "")) != null) {
            singleCardLabelB = n50.l.b(labelB, aVar, null, 2, null);
        }
        return new DefaultSingleCardData(str, new er.a() { // from class: kz1.a
            @Override // er.a
            public final Object a() {
                return b.m(lVar, electionSupportCommitteeData);
            }
        }, false, null, null, false, null, null, new BodySection(null, title, singleCardLabelB, 1, null), null, x0.Icon.INSTANCE.b(), null, 2812, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, ElectionSupportCommitteeData electionSupportCommitteeData) {
        lVar.b(electionSupportCommitteeData);
        return i0.f148189a;
    }

    private final boolean r(AvailableElectionSupport availableElectionSupport) {
        int i15 = C2756b.f113484a[availableElectionSupport.getElectionActionType().ordinal()];
        return i15 == 1 || i15 == 2 || i15 == 3;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public jz1.f.Data b(Params params) {
        boolean zR = r(params.getState().getAvailableElectionSupport());
        List<ElectionSupportCommitteeData> listI = i(params.getState().getAvailableElectionSupport().b(), params.getState().getSearchQuery(), zR);
        ArrayList arrayList = new ArrayList(v.y(listI, 10));
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(l((ElectionSupportCommitteeData) it.next(), zR, params.d()));
        }
        return new jz1.f.Data(new BaseScaffoldData(null, !params.getState().getSearchIsActive() ? new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), zR ? this.labelProvider.c(fz1.a.f68958l) : this.labelProvider.c(fz1.a.S), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null) : null, null, null, null, null, 61, null), zR ? this.labelProvider.c(fz1.a.f68962n) : this.labelProvider.c(fz1.a.U), zR ? this.labelProvider.c(fz1.a.f68960m) : this.labelProvider.c(fz1.a.T), new SearchBarData(params.getState().getSearchQuery(), params.e(), params.getState().getSearchIsActive(), params.a(), params.f(), this.labelProvider.c(fz1.a.f68950h), null, Integer.valueOf(arrayList.size()), 64, null), new CardListData(arrayList, null, false, null, null, 30, null), arrayList.isEmpty() ? new EmptyStateData(this.labelProvider.c(fz1.a.f68948g), this.labelProvider.c(fz1.a.f68952i), null, 4, null) : null);
    }
}
