package jq3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oo0.Idea;
import oo0.k;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import r70.BaseFloatingActionButtonData;
import x50.NavigationButtonData;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002?=B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0012\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010#\u001a\u00020\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$J+\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0\u0014H\u0002¢\u0006\u0004\b)\u0010*J9\u00100\u001a\u00020/2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010.\u001a\u00020%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b0\u0014H\u0002¢\u0006\u0004\b0\u00101J'\u00102\u001a\b\u0012\u0004\u0012\u00020,0+*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010.\u001a\u00020%H\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\b\u0012\u0004\u0012\u0002040+*\b\u0012\u0004\u0012\u00020,0+2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b0\u0014H\u0002¢\u0006\u0004\b5\u00106J'\u00108\u001a\b\u0012\u0004\u0012\u00020,0+*\b\u0012\u0004\u0012\u00020,0+2\u0006\u00107\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Ljq3/e;", "Lxw/f;", "Ljq3/e$b;", "Liq3/f$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "Lkotlin/Function0;", "Loq/i0;", "backAction", "helpAction", "onAddIdeaAction", "", "isSearchActive", "Li50/a;", "r", "(Ler/a;Ler/a;Ler/a;Z)Li50/a;", "Lkotlin/Function1;", "", "onUrlClick", "Lk40/a;", "G", "(Ler/l;)Lk40/a;", "isVoteIdeaDevFFEnabled", "onClose", "onHelpClick", "q", "(ZLer/a;Ler/a;)Li50/a;", "onAddIdeaClick", "onInfoButtonClick", "onShowResultsClick", "Lq40/f;", "m", "(Ler/a;Ler/a;Ler/a;Z)Lq40/f;", "Lkq3/a;", "selectedFilterCategory", "onClick", "Ly30/n$a;", "v", "(Lkq3/a;Ler/l;)Ly30/n$a;", "", "Loo0/i;", "ideaDetails", "filterCategory", "Ln30/b;", "z", "(Ljava/util/List;Lkq3/a;Ler/l;)Ln30/b;", "i", "(Ljava/util/List;Lkq3/a;)Ljava/util/List;", "Ln50/g;", "E", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "query", "l", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "params", "s", "(Ljq3/e$b;)Liq3/f$a;", "a", "Lmx/c;", "b", "Lu04/a;", "c", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, iq3.f.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104382d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: jq3.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b\u001f\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010&R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b#\u0010*R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b.\u0010&¨\u00061"}, d2 = {"Ljq3/e$b;", "", "Liq3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onInfoButtonClick", "Lkotlin/Function1;", "Loo0/i;", "onIdeaClick", "onAddIdeaClick", "onClose", "Lkq3/a;", "onChangeFilterCategory", "", "onSearchActiveChange", "", "onQueryChange", "onQueryClear", "onEmptyStateUrlClick", "onShowResultsClick", "<init>", "(Liq3/e;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liq3/e;", "j", "()Liq3/e;", "b", "Ler/a;", "f", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "d", "g", "h", "i", "getOnQueryClear", "k", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iq3.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInfoButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Idea, i0> onIdeaClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddIdeaClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<kq3.a, i0> onChangeFilterCategory;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onSearchActiveChange;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onQueryChange;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onQueryClear;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEmptyStateUrlClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowResultsClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(iq3.e eVar, er.a<i0> aVar, l<? super Idea, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super kq3.a, i0> lVar2, l<? super Boolean, i0> lVar3, l<? super String, i0> lVar4, er.a<i0> aVar4, l<? super String, i0> lVar5, er.a<i0> aVar5) {
            this.state = eVar;
            this.onInfoButtonClick = aVar;
            this.onIdeaClick = lVar;
            this.onAddIdeaClick = aVar2;
            this.onClose = aVar3;
            this.onChangeFilterCategory = lVar2;
            this.onSearchActiveChange = lVar3;
            this.onQueryChange = lVar4;
            this.onQueryClear = aVar4;
            this.onEmptyStateUrlClick = lVar5;
            this.onShowResultsClick = aVar5;
        }

        public final er.a<i0> a() {
            return this.onAddIdeaClick;
        }

        public final l<kq3.a, i0> b() {
            return this.onChangeFilterCategory;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final l<String, i0> d() {
            return this.onEmptyStateUrlClick;
        }

        public final l<Idea, i0> e() {
            return this.onIdeaClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onInfoButtonClick, params.onInfoButtonClick) && t.c(this.onIdeaClick, params.onIdeaClick) && t.c(this.onAddIdeaClick, params.onAddIdeaClick) && t.c(this.onClose, params.onClose) && t.c(this.onChangeFilterCategory, params.onChangeFilterCategory) && t.c(this.onSearchActiveChange, params.onSearchActiveChange) && t.c(this.onQueryChange, params.onQueryChange) && t.c(this.onQueryClear, params.onQueryClear) && t.c(this.onEmptyStateUrlClick, params.onEmptyStateUrlClick) && t.c(this.onShowResultsClick, params.onShowResultsClick);
        }

        public final er.a<i0> f() {
            return this.onInfoButtonClick;
        }

        public final l<String, i0> g() {
            return this.onQueryChange;
        }

        public final l<Boolean, i0> h() {
            return this.onSearchActiveChange;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.onInfoButtonClick.hashCode()) * 31) + this.onIdeaClick.hashCode()) * 31) + this.onAddIdeaClick.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onChangeFilterCategory.hashCode()) * 31) + this.onSearchActiveChange.hashCode()) * 31) + this.onQueryChange.hashCode()) * 31) + this.onQueryClear.hashCode()) * 31) + this.onEmptyStateUrlClick.hashCode()) * 31) + this.onShowResultsClick.hashCode();
        }

        public final er.a<i0> i() {
            return this.onShowResultsClick;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final iq3.e getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onInfoButtonClick=" + this.onInfoButtonClick + ", onIdeaClick=" + this.onIdeaClick + ", onAddIdeaClick=" + this.onAddIdeaClick + ", onClose=" + this.onClose + ", onChangeFilterCategory=" + this.onChangeFilterCategory + ", onSearchActiveChange=" + this.onSearchActiveChange + ", onQueryChange=" + this.onQueryChange + ", onQueryClear=" + this.onQueryClear + ", onEmptyStateUrlClick=" + this.onEmptyStateUrlClick + ", onShowResultsClick=" + this.onShowResultsClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104396a;

        static {
            int[] iArr = new int[kq3.a.values().length];
            try {
                iArr[kq3.a.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kq3.a.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kq3.a.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kq3.a.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104396a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f104397a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(270400914);
            if (p076m2.t.k()) {
                p076m2.t.o(270400914, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.mapper.VoteIdeaListMapper.getScaffoldDataEmpty.<anonymous> (VoteIdeaListMapper.kt:221)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: renamed from: jq3.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2480e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2480e f104398a = new C2480e();

        C2480e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(102753365);
            if (p076m2.t.k()) {
                p076m2.t.o(102753365, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.mapper.VoteIdeaListMapper.getScaffoldDataInitialized.<anonymous>.<anonymous> (VoteIdeaListMapper.kt:168)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public e(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final List<DefaultSingleCardData> E(List<Idea> list, final l<? super Idea, i0> lVar) {
        List<Idea> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final Idea idea = (Idea) obj;
            LeadingSection leadingSection = new LeadingSection(false, null, new i.Icon(jz.a.E1, null, null, d40.i.f.f39709e, null, 22, null), 3, null);
            if (!idea.getVotedByUser()) {
                leadingSection = null;
            }
            LeadingSection leadingSection2 = leadingSection;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: jq3.b
                @Override // er.a
                public final Object a() {
                    return e.F(lVar, idea);
                }
            }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(idea.getCategory().getDescription(), "idea_category_description:  " + i15), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(idea.getTopic(), "idea_topic:  " + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.e(gp3.a.f76125f0, String.valueOf(idea.getVotes())), null, null, 0, 0, null, 62, null)), leadingSection2, x0.Icon.INSTANCE.b(), null, 2301, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(l lVar, Idea idea) {
        lVar.b(idea);
        return i0.f148189a;
    }

    private final EmptyStateData G(final l<? super String, i0> onUrlClick) {
        return new EmptyStateData(this.labelProvider.c(gp3.a.f76122e), mx.b.b(this.labelProvider.c(gp3.a.f76126g).getText() + "\n\n" + this.labelProvider.c(gp3.a.f76156v).getText(), "empty_state_description_label"), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(gp3.a.f76154u), null, 2, null), k30.d.c.f107775a, null, new er.a() { // from class: jq3.c
            @Override // er.a
            public final Object a() {
                return e.H(onUrlClick, this);
            }
        }, 35, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(l lVar, e eVar) {
        lVar.b(eVar.commonEndpoints.Q());
        return i0.f148189a;
    }

    private final List<Idea> i(List<Idea> list, kq3.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Idea idea = (Idea) obj;
            int i15 = c.f104396a[aVar.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 4) {
                            throw new oq.p();
                        }
                        if (idea.getCategory().getCode() != k.UNKNOWN) {
                            arrayList.add(obj);
                        }
                    } else if (idea.getCategory().getCode() == k.OTHER) {
                        arrayList.add(obj);
                    }
                } else if (idea.getCategory().getCode() == k.SERVICES) {
                    arrayList.add(obj);
                }
            } else if (idea.getCategory().getCode() == k.DOCUMENTS) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<Idea> l(List<Idea> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (fu.r.b0(((Idea) obj).getTopic(), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final IconPageBottomContentData m(er.a<i0> onAddIdeaClick, er.a<i0> onInfoButtonClick, er.a<i0> onShowResultsClick, boolean isVoteIdeaDevFFEnabled) {
        return isVoteIdeaDevFFEnabled ? new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.I), null, 2, null), k30.d.a.f107773a, null, onShowResultsClick, 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.W), null, 2, null), new k30.d.Secondary(null, 1, null), null, onAddIdeaClick, 35, null), null, 4, null) : new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.W), null, 2, null), k30.d.a.f107773a, null, onAddIdeaClick, 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.V), null, 2, null), new k30.d.Secondary(null, 1, null), null, onInfoButtonClick, 35, null), null, 4, null);
    }

    private final BaseScaffoldData q(boolean isVoteIdeaDevFFEnabled, er.a<i0> onClose, er.a<i0> onHelpClick) {
        if (isVoteIdeaDevFFEnabled) {
            return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onClose), this.labelProvider.c(gp3.a.Q0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, d.f104397a, null, onHelpClick, 4, null)), null, 20, null), null, null, null, null, 61, null);
        }
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onClose), this.labelProvider.c(gp3.a.Q0), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final BaseScaffoldData r(er.a<i0> backAction, er.a<i0> helpAction, er.a<i0> onAddIdeaAction, boolean isSearchActive) {
        List listN;
        x50.i.Small small = (!isSearchActive ? this : null) != null ? new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), backAction), this.labelProvider.c(gp3.a.Q0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, C2480e.f104398a, null, helpAction, 4, null)), null, 20, null) : null;
        if ((isSearchActive ? null : this) == null || (listN = v.e(new BaseFloatingActionButtonData(jz.a.f106760e0, new BaseFloatingActionButtonData.InterfaceC4389a.Extended(this.labelProvider.c(gp3.a.f76121d0)), onAddIdeaAction))) == null) {
            listN = v.n();
        }
        return new BaseScaffoldData(null, small, listN, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.g().b("");
        return i0.f148189a;
    }

    private final n.Filter v(kq3.a selectedFilterCategory, final l<? super kq3.a, i0> onClick) {
        return new n.Filter(v.q(this.labelProvider.c(gp3.a.Y), this.labelProvider.c(gp3.a.Z), this.labelProvider.c(gp3.a.f76117b0), this.labelProvider.c(gp3.a.f76115a0)), kq3.b.b(selectedFilterCategory), new l() { // from class: jq3.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.x(onClick, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(l lVar, int i15) {
        lVar.b(kq3.b.a(i15));
        return i0.f148189a;
    }

    private final CardListData z(List<Idea> ideaDetails, kq3.a filterCategory, l<? super Idea, i0> onClick) {
        return new CardListData(E(i(ideaDetails, filterCategory), onClick), null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public iq3.f.a b(final Params params) {
        iq3.e state = params.getState();
        if (t.c(state, iq3.e.b.f96567a)) {
            return iq3.f.a.b.f96577a;
        }
        if (state instanceof iq3.e.Empty) {
            return new iq3.f.a.Empty(new IconPageData(new j.a(jz.a.f106800j2), this.labelProvider.c(gp3.a.X), this.labelProvider.c(gp3.a.U), null, i0.f148189a, m(params.a(), params.f(), params.i(), ((iq3.e.Empty) params.getState()).getIsVoteIdeaDevFFEnabled()), false, 72, null), q(((iq3.e.Empty) params.getState()).getIsVoteIdeaDevFFEnabled(), params.c(), params.f()));
        }
        if (!(state instanceof iq3.e.Initialized)) {
            throw new oq.p();
        }
        CardListData cardListData = new CardListData(E(l(((iq3.e.Initialized) params.getState()).getIdeasRoundDetails().d(), ((iq3.e.Initialized) params.getState()).getSearchQuery()), params.e()), null, false, null, null, 30, null);
        er.a<i0> aVarC = params.c();
        Label labelC = this.labelProvider.c(gp3.a.f76119c0);
        Label labelC2 = this.labelProvider.c(gp3.a.f76124f);
        SearchBarData searchBarData = new SearchBarData(((iq3.e.Initialized) params.getState()).getSearchQuery(), params.g(), ((iq3.e.Initialized) params.getState()).getIsSearchActive(), params.h(), new er.a() { // from class: jq3.a
            @Override // er.a
            public final Object a() {
                return e.u(params);
            }
        }, labelC2, null, Integer.valueOf(cardListData.d().size()), 64, null);
        EmptyStateData emptyStateDataG = G(params.d());
        n.Filter filterV = v(((iq3.e.Initialized) params.getState()).getSelectedFilterCategory(), params.b());
        CardListData cardListDataZ = z(((iq3.e.Initialized) params.getState()).getIdeasRoundDetails().d(), ((iq3.e.Initialized) params.getState()).getSelectedFilterCategory(), params.e());
        EmptyStateData emptyStateData = new EmptyStateData(this.labelProvider.c(gp3.a.T), this.labelProvider.c(gp3.a.S), null, 4, null);
        Label labelB = mx.b.b(((iq3.e.Initialized) params.getState()).getIdeasRoundDetails().getActiveRoundMobileName(), "activeRoundMobileName");
        int activeRoundEndDaysCounter = ((iq3.e.Initialized) params.getState()).getIdeasRoundDetails().getActiveRoundEndDaysCounter();
        return new iq3.f.a.Initialized(r(params.c(), params.f(), params.a(), ((iq3.e.Initialized) params.getState()).getIsSearchActive()), aVarC, labelC, searchBarData, cardListData, emptyStateDataG, filterV, cardListDataZ, emptyStateData, labelB, (activeRoundEndDaysCounter == 1 ? this.labelProvider.c(gp3.a.R) : this.labelProvider.e(gp3.a.Q, Integer.valueOf(activeRoundEndDaysCounter))).n("activeRoundEndDaysCounter"), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(gp3.a.I), null, 2, null), k30.d.a.f107773a, k30.b.c.f107768a, params.i(), 3, null), ((iq3.e.Initialized) params.getState()).getIsVoteIdeaDevFFEnabled());
    }
}
