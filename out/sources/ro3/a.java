package ro3;

import co3.n;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import ko3.SendDocumentInfoState;
import lo3.e;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import qo3.b;
import qo3.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lro3/a;", "Lxw/f;", "Lro3/a$a;", "Lqo3/c$a;", "Lmx/c;", "labelProvider", "Llo3/e;", "documentSectionMapper", "Llo3/f;", "entitySectionMapper", "Llo3/a;", "bulletSectionMapper", "<init>", "(Lmx/c;Llo3/e;Llo3/f;Llo3/a;)V", "params", "c", "(Lro3/a$a;)Lqo3/c$a;", "a", "Lmx/c;", "b", "Llo3/e;", "Llo3/f;", "d", "Llo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e documentSectionMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lo3.f entitySectionMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lo3.a bulletSectionMapper;

    /* JADX INFO: renamed from: ro3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lro3/a$a;", "", "Lqo3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "navigateBack", "navigateToNext", "<init>", "(Lqo3/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqo3/b;", "c", "()Lqo3/b;", "b", "Ler/a;", "()Ler/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateToNext;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.navigateBack = aVar;
            this.navigateToNext = aVar2;
        }

        public final er.a<i0> a() {
            return this.navigateBack;
        }

        public final er.a<i0> b() {
            return this.navigateToNext;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getState() {
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
            return t.c(this.state, params.state) && t.c(this.navigateBack, params.navigateBack) && t.c(this.navigateToNext, params.navigateToNext);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.navigateBack.hashCode()) * 31) + this.navigateToNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", navigateBack=" + this.navigateBack + ", navigateToNext=" + this.navigateToNext + ')';
        }
    }

    public a(mx.c cVar, e eVar, lo3.f fVar, lo3.a aVar) {
        this.labelProvider = cVar;
        this.documentSectionMapper = eVar;
        this.entitySectionMapper = fVar;
        this.bulletSectionMapper = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        b state = params.getState();
        if ((state instanceof b.a) || (state instanceof b.Loading)) {
            return c.a.C4230a.f167733a;
        }
        if (!(state instanceof b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(un3.b.Q2), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(un3.b.D0);
        e.AdditionalData additionalData = null;
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(un3.b.f199395a3), null, 2, null), d.a.f107773a, null, params.b(), 35, null);
        e eVar = this.documentSectionMapper;
        e.MainData mainData = new e.MainData(false, ((b.Initialized) params.getState()).getSelectedDocument(), ((b.Initialized) params.getState()).d().c(), null, 8, null);
        n subDocument = ((b.Initialized) params.getState()).getSubDocument();
        if (subDocument != null) {
            additionalData = new e.AdditionalData(false, true, subDocument, null, null, 16, null);
        }
        return new c.a.Initialized(baseScaffoldData, aVarA, labelC, buttonData, this.entitySectionMapper.b(new lo3.f.Params(lo3.f.a.c.f119035a)), this.bulletSectionMapper.b(new lo3.a.Params(((b.Initialized) params.getState()).b())), new SendDocumentInfoState(this.labelProvider.c(un3.b.f199405c3), this.labelProvider.c(un3.b.f199400b3)), eVar.b(new e.Params(mainData, additionalData)));
    }
}
