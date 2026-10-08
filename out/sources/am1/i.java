package am1;

import fr.t;
import java.util.List;
import nk1.SummaryModel;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0018BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lam1/i;", "Lxw/f;", "Lam1/i$a;", "", "Lyl1/i$a$b$b;", "Lam1/e;", "parentOrGuardDataMapper", "Lam1/b;", "childDataMapper", "Lam1/f;", "parentsDataMapper", "Lam1/d;", "invalidationReasonMapper", "Lam1/g;", "selectedOfficeMapper", "Lam1/a;", "certReceiveMethodMapper", "Lam1/c;", "contactDetailsMapper", "<init>", "(Lam1/e;Lam1/b;Lam1/f;Lam1/d;Lam1/g;Lam1/a;Lam1/c;)V", "params", "c", "(Lam1/i$a;)Ljava/util/List;", "a", "Lam1/e;", "b", "Lam1/b;", "Lam1/f;", "d", "Lam1/d;", "e", "Lam1/g;", "f", "Lam1/a;", "g", "Lam1/c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, List<? extends yl1.i.a.Initialized.Section>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e parentOrGuardDataMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b childDataMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f parentsDataMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d invalidationReasonMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g selectedOfficeMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a certReceiveMethodMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c contactDetailsMapper;

    /* JADX INFO: renamed from: am1.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lam1/i$a;", "", "Lkk1/a;", "type", "Lnk1/a;", "model", "<init>", "(Lkk1/a;Lnk1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "b", "()Lkk1/a;", "Lnk1/a;", "()Lnk1/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kk1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SummaryModel model;

        public Params(kk1.a aVar, SummaryModel summaryModel) {
            this.type = aVar;
            this.model = summaryModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SummaryModel getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final kk1.a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.type == params.type && t.c(this.model, params.model);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.model.hashCode();
        }

        public String toString() {
            return "Params(type=" + this.type + ", model=" + this.model + ')';
        }
    }

    public i(e eVar, b bVar, f fVar, d dVar, g gVar, a aVar, c cVar) {
        this.parentOrGuardDataMapper = eVar;
        this.childDataMapper = bVar;
        this.parentsDataMapper = fVar;
        this.invalidationReasonMapper = dVar;
        this.selectedOfficeMapper = gVar;
        this.certReceiveMethodMapper = aVar;
        this.contactDetailsMapper = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<yl1.i.a.Initialized.Section> b(Params params) {
        SummaryModel model = params.getModel();
        return v.q(this.parentOrGuardDataMapper.b(new e.Params(model.getParentOrGuardData())), this.childDataMapper.b(new b.Params(params.getType(), model.getChildAndParentsData().getChildData())), this.parentsDataMapper.b(new f.Params(params.getType(), model.getChildAndParentsData().getParentsData())), this.invalidationReasonMapper.b(new d.Params(model.getInvalidationReason())), this.selectedOfficeMapper.b(new g.Params(model.getSelectedOffice())), this.certReceiveMethodMapper.b(new a.Params(model.getCertReceiveMethod())), this.contactDetailsMapper.b(new c.Params(model.getContactDetails(), model.getUserEdorAddress())));
    }
}
