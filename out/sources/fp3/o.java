package fp3;

import android.graphics.Bitmap;
import b30.AccordionData;
import b30.AccordionElement;
import co3.Section;
import co3.SectionRow;
import co3.SingleCardData;
import co3.VerificationDetailsResult;
import co3.s;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import jr0.NipipScope;
import l60.AccordionSection;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=By\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J?\u0010-\u001a\u00020,2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020\"*\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u0002022\u0006\u0010'\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u00020&H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lfp3/o;", "Lxw/f;", "Lfp3/o$a;", "Ldp3/c$a;", "Lmx/c;", "labelProvider", "Lfp3/n;", "scope8Mapper", "Lfp3/h;", "scope2001Mapper", "Lfp3/k;", "scope3001Mapper", "Lfp3/d;", "scope1000000Mapper", "Lfp3/e;", "scope1000400Mapper", "Lfp3/f;", "scope1001000Mapper", "Lfp3/g;", "scope1003000Mapper", "Lfp3/i;", "scope3000000or1Mapper", "Lfp3/j;", "scope3001000Mapper", "Lfp3/l;", "scope5000000Mapper", "Lfp3/m;", "scope7000000Mapper", "Lfp3/a;", "dynamicDocumentMapper", "Lfp3/b;", "juniorSchoolCardMapper", "<init>", "(Lmx/c;Lfp3/n;Lfp3/h;Lfp3/k;Lfp3/d;Lfp3/e;Lfp3/f;Lfp3/g;Lfp3/i;Lfp3/j;Lfp3/l;Lfp3/m;Lfp3/a;Lfp3/b;)V", "Lco3/t;", "verificationDetailsResult", "Landroid/graphics/Bitmap;", "imageBitmap", "", "maxTime", "leftTime", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Ldp3/c$a$b;", "f", "(Lco3/t;Landroid/graphics/Bitmap;IILer/a;)Ldp3/c$a$b;", "Lco3/s;", "i", "(Lco3/s;)Lco3/t;", "", "timeToExpire", "h", "(FF)F", "time", "Lmx/a;", "c", "(I)Lmx/a;", "params", "e", "(Lfp3/o$a;)Ldp3/c$a;", "a", "Lmx/c;", "b", "Lfp3/n;", "Lfp3/h;", "d", "Lfp3/k;", "Lfp3/d;", "Lfp3/e;", "g", "Lfp3/f;", "Lfp3/g;", "j", "Lfp3/i;", "k", "Lfp3/j;", "l", "Lfp3/l;", "m", "Lfp3/m;", "n", "Lfp3/a;", "p", "Lfp3/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements xw.f<Params, dp3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n scope8Mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h scope2001Mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k scope3001Mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d scope1000000Mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e scope1000400Mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f scope1001000Mapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g scope1003000Mapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i scope3000000or1Mapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final j scope3001000Mapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Scope5000000Mapper scope5000000Mapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final m scope7000000Mapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a dynamicDocumentMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final b juniorSchoolCardMapper;

    /* JADX INFO: renamed from: fp3.o$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfp3/o$a;", "", "Ldp3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Ldp3/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldp3/b;", "b", "()Ldp3/b;", "Ler/a;", "()Ler/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dp3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(dp3.b bVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onClose = aVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final dp3.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ')';
        }
    }

    public o(mx.c cVar, n nVar, h hVar, k kVar, d dVar, e eVar, f fVar, g gVar, i iVar, j jVar, Scope5000000Mapper scope5000000Mapper, m mVar, a aVar, b bVar) {
        this.labelProvider = cVar;
        this.scope8Mapper = nVar;
        this.scope2001Mapper = hVar;
        this.scope3001Mapper = kVar;
        this.scope1000000Mapper = dVar;
        this.scope1000400Mapper = eVar;
        this.scope1001000Mapper = fVar;
        this.scope1003000Mapper = gVar;
        this.scope3000000or1Mapper = iVar;
        this.scope3001000Mapper = jVar;
        this.scope5000000Mapper = scope5000000Mapper;
        this.scope7000000Mapper = mVar;
        this.dynamicDocumentMapper = aVar;
        this.juniorSchoolCardMapper = bVar;
    }

    private final Label c(int time) {
        return this.labelProvider.e(un3.b.f199481s, Integer.valueOf((time % 3600) / 60), Integer.valueOf(time % 60));
    }

    private final dp3.c.a.Initialized f(VerificationDetailsResult verificationDetailsResult, Bitmap imageBitmap, int maxTime, int leftTime, er.a<i0> onClose) {
        AccordionSection accordionSection;
        Label labelB = mx.b.b(this.labelProvider.c(un3.b.f199482s0).getText() + ":", "timerLabel");
        List<SingleCardData> listD = verificationDetailsResult.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        for (SingleCardData singleCardData : listD) {
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(singleCardData.getTitle(), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(singleCardData.getValue(), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onClose), this.labelProvider.c(un3.b.f199517z0), null, null, null, 28, null), null, null, null, null, 61, null);
        w0.StatusBadge statusBadge = new w0.StatusBadge(new r50.a.WithIcon(null, this.labelProvider.c(un3.b.f199487t0), null, 0, true, r50.g.POSITIVE, 13, null));
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(verificationDetailsResult.getDocumentTitle(), null, null, 0, 0, null, 62, null));
        StringBuilder sb5 = new StringBuilder();
        if (verificationDetailsResult.getDocumentDescription() != null) {
            sb5.append(verificationDetailsResult.getDocumentDescription().getText());
            sb5.append("\n");
        }
        sb5.append(verificationDetailsResult.getVerificationDateTime().getText());
        i0 i0Var = i0.f148189a;
        BodySection bodySection = new BodySection(null, title, new SingleCardLabel(mx.b.b(sb5.toString(), "description"), null, null, 0, 0, null, 62, null), 1, null);
        Label documentExpireDate = verificationDetailsResult.getDocumentExpireDate();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, statusBadge, bodySection, null, null, documentExpireDate != null ? new BottomSection(null, new SingleCardLabel(documentExpireDate, null, null, 0, 0, null, 62, null), 1, null) : null, 1663, null);
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        Section section = verificationDetailsResult.getSection();
        if (section != null) {
            Label title2 = section.getTitle();
            List<SectionRow> listA = section.a();
            ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
            for (SectionRow sectionRow : listA) {
                arrayList2.add(new AccordionElement(null, sectionRow.getTitle(), null, false, null, false, new ep3.b(sectionRow.a()), 61, null));
            }
            accordionSection = new AccordionSection(title2, new AccordionData(arrayList2));
        } else {
            accordionSection = null;
        }
        return new dp3.c.a.Initialized(baseScaffoldData, imageBitmap, defaultSingleCardData, cardListData, accordionSection, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(un3.b.K0), null, 2, null), k30.d.a.f107773a, null, onClose, 35, null), h(maxTime, leftTime), labelB, c(leftTime));
    }

    private final float h(float maxTime, float timeToExpire) {
        return timeToExpire / maxTime;
    }

    private final VerificationDetailsResult i(s sVar) {
        if (sVar instanceof s.MIdData) {
            s.MIdData mIdData = (s.MIdData) sVar;
            return this.scope8Mapper.b(new n.Params(mIdData.getData(), mIdData.getVerificationDateTime(), mIdData.getPicture()));
        }
        if (sVar instanceof s.JuniorSchoolData) {
            s.JuniorSchoolData juniorSchoolData = (s.JuniorSchoolData) sVar;
            return this.juniorSchoolCardMapper.b(new b.Params(juniorSchoolData.getData(), juniorSchoolData.getVerificationDateTime(), juniorSchoolData.getPicture()));
        }
        if (sVar instanceof s.StudentData) {
            s.StudentData studentData = (s.StudentData) sVar;
            return this.scope2001Mapper.b(new h.Params(studentData.getData(), studentData.getVerificationDateTime(), studentData.getPicture()));
        }
        if (sVar instanceof s.DiiaData) {
            s.DiiaData diiaData = (s.DiiaData) sVar;
            return this.scope3001Mapper.b(new k.Params(diiaData.getData(), diiaData.getVerificationDateTime(), diiaData.getPicture()));
        }
        if (sVar instanceof s.DrivingLicenceData) {
            s.DrivingLicenceData drivingLicenceData = (s.DrivingLicenceData) sVar;
            return this.scope1000000Mapper.b(new d.Params(drivingLicenceData.getData(), drivingLicenceData.getVerificationDateTime(), drivingLicenceData.getPicture()));
        }
        if (sVar instanceof s.DeputyData) {
            s.DeputyData deputyData = (s.DeputyData) sVar;
            return this.scope1000400Mapper.b(new e.Params(deputyData.getData(), deputyData.getVerificationDateTime(), deputyData.getPicture()));
        }
        if (sVar instanceof s.FamilyCardData) {
            s.FamilyCardData familyCardData = (s.FamilyCardData) sVar;
            return this.scope1001000Mapper.b(new f.Params(familyCardData.getData(), familyCardData.getVerificationDateTime(), familyCardData.getPicture()));
        }
        if (sVar instanceof s.PensionerData) {
            s.PensionerData pensionerData = (s.PensionerData) sVar;
            return this.scope1003000Mapper.b(new g.Params(pensionerData.getData(), pensionerData.getVerificationDateTime(), pensionerData.getPicture()));
        }
        if (sVar instanceof s.NipipData) {
            i iVar = this.scope3000000or1Mapper;
            s.NipipData nipipData = (s.NipipData) sVar;
            NipipScope data = nipipData.getData();
            String picture = nipipData.getPicture();
            return iVar.b(new i.Params(nipipData.getScope(), data, nipipData.getVerificationDateTime(), picture));
        }
        if (sVar instanceof s.AdvocateData) {
            s.AdvocateData advocateData = (s.AdvocateData) sVar;
            return this.scope3001000Mapper.b(new j.Params(advocateData.getData(), advocateData.getVerificationDateTime(), advocateData.getPicture()));
        }
        if (sVar instanceof s.RailwayCardData) {
            s.RailwayCardData railwayCardData = (s.RailwayCardData) sVar;
            return this.scope5000000Mapper.b(new Scope5000000Mapper.Params(railwayCardData.getData(), railwayCardData.getVerificationDateTime(), railwayCardData.getPicture()));
        }
        if (sVar instanceof s.WruData) {
            s.WruData wruData = (s.WruData) sVar;
            return this.scope7000000Mapper.b(new m.Params(wruData.getData(), wruData.getVerificationDateTime(), wruData.getPicture()));
        }
        if (!(sVar instanceof s.DynamicDocumentData)) {
            throw new p();
        }
        s.DynamicDocumentData dynamicDocumentData = (s.DynamicDocumentData) sVar;
        return this.dynamicDocumentMapper.b(new a.Params(dynamicDocumentData.getData(), dynamicDocumentData.getVerificationDateTime(), dynamicDocumentData.getPicture()));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public dp3.c.a b(Params params) {
        dp3.b state = params.getState();
        if (t.c(state, dp3.b.a.f43701a)) {
            return dp3.c.a.C0984a.f43706a;
        }
        if (!(state instanceof dp3.b.Initialized)) {
            throw new p();
        }
        dp3.b.Initialized initialized = (dp3.b.Initialized) params.getState();
        return f(i(initialized.getVerificationDetailsData()), initialized.getImageBitmap(), initialized.getMaxTime(), initialized.getLeftTime(), params.a());
    }
}
