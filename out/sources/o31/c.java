package o31;

import fr.t;
import iy.b0;
import iy.c0;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo31/c;", "Lgz/b;", "Lo31/c$a;", "", "Lb51/a;", "Lo31/d;", "validDataParentsUseCase", "<init>", "(Lo31/d;)V", "Lb51/a$d;", "fieldData", "Lhz/b;", "g", "(Lb51/a$d;Ltq/e;)Ljava/lang/Object;", "Lo31/d$a;", "f", "(Lo31/d$a;Ltq/e;)Ljava/lang/Object;", "params", "e", "(Lo31/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lo31/d;", "getValidDataParentsUseCase", "()Lo31/d;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<Params, List<? extends b51.a<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d validDataParentsUseCase;

    /* JADX INFO: renamed from: o31.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lo31/c$a;", "Lgz/b$a;", "", "Lb51/a;", "sections", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b51.a<?>> sections;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(List<? extends b51.a<?>> list) {
            this.sections = list;
        }

        public final List<b51.a<?>> a() {
            return this.sections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.sections, ((Params) other).sections);
        }

        public int hashCode() {
            return this.sections.hashCode();
        }

        public String toString() {
            return "Params(sections=" + this.sections + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        int A;
        int B;
        int C;
        int D;
        /* synthetic */ Object E;
        int G;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f141853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f141854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f141855h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f141856j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f141857k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f141858l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f141859m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f141860n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f141861p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f141862q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f141863r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f141864s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f141865t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f141866v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f141867w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f141868x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f141869y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f141870z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.E = obj;
            this.G |= PKIFailureInfo.systemUnavail;
            return c.this.e(null, this);
        }
    }

    /* JADX INFO: renamed from: o31.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3493c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141873f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f141875h;

        C3493c(tq.e<? super C3493c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f141873f = obj;
            this.f141875h |= PKIFailureInfo.systemUnavail;
            return c.this.f(null, this);
        }
    }

    public c(d dVar) {
        this.validDataParentsUseCase = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(d.a aVar, tq.e<? super hz.b> eVar) throws Throwable {
        C3493c c3493c;
        hz.b.Companion companion;
        if (eVar instanceof C3493c) {
            c3493c = (C3493c) eVar;
            int i15 = c3493c.f141875h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3493c.f141875h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3493c = new C3493c(eVar);
            }
        } else {
            c3493c = new C3493c(eVar);
        }
        Object obj = c3493c.f141873f;
        Object objE = uq.b.e();
        int i16 = c3493c.f141875h;
        if (i16 == 0) {
            u.b(obj);
            hz.b.Companion companion2 = hz.b.INSTANCE;
            d dVar = this.validDataParentsUseCase;
            c3493c.f141871d = j.a(aVar);
            c3493c.f141872e = companion2;
            c3493c.f141875h = 1;
            Object objD = dVar.d(aVar, c3493c);
            if (objD == objE) {
                return objE;
            }
            obj = objD;
            companion = companion2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (hz.b.Companion) c3493c.f141872e;
            u.b(obj);
        }
        return companion.a((hz.g) obj);
    }

    private final Object g(b51.a.FieldData fieldData, tq.e<? super hz.b> eVar) {
        b0 b0VarG;
        b51.a.FieldData.InterfaceC0401a value = fieldData.getValue();
        b51.a.FieldData.InterfaceC0401a.Text text = value instanceof b51.a.FieldData.InterfaceC0401a.Text ? (b51.a.FieldData.InterfaceC0401a.Text) value : null;
        if (text == null || (b0VarG = text.getText()) == null) {
            b0VarG = c0.g("");
        }
        b51.a.c field = fieldData.getField();
        if (field == b51.a.SecondDataParent.EnumC0405a.FirstName) {
            return f(new d.a.f(b0VarG), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.SecondName) {
            return f(new d.a.l(b0VarG), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.NextName) {
            return f(new d.a.h(b0VarG), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.LastName) {
            return f(new d.a.g(b0VarG), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.FamilyName) {
            return f(new d.a.C3495d(b0VarG), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.PESEL) {
            return f(new d.a.i(b0VarG), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.PlaceOfBirth) {
            return f(new d.a.j(b0VarG), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.DateOfBirth) {
            b51.a.FieldData.InterfaceC0401a value2 = fieldData.getValue();
            b51.a.FieldData.InterfaceC0401a.Date date = value2 instanceof b51.a.FieldData.InterfaceC0401a.Date ? (b51.a.FieldData.InterfaceC0401a.Date) value2 : null;
            return f(new d.a.c(date != null ? date.getData() : null), eVar);
        }
        if (field == b51.a.SecondDataParent.EnumC0405a.Citizenship) {
            b51.a.FieldData.InterfaceC0401a value3 = fieldData.getValue();
            b51.a.FieldData.InterfaceC0401a.DropDown dropDown = value3 instanceof b51.a.FieldData.InterfaceC0401a.DropDown ? (b51.a.FieldData.InterfaceC0401a.DropDown) value3 : null;
            return f(new d.a.b(dropDown != null ? dropDown.getData() : null), eVar);
        }
        if (field == b51.a.FatherPlaceOfBirthCertificate.EnumC0400a.Place || field == b51.a.MarriageCertificate.EnumC0403a.Place || field == b51.a.YourBirthCertificate.EnumC0406a.Place || field == b51.a.MotherPlaceOfBirthCertificate.EnumC0404a.Place) {
            return f(new d.a.k(b0VarG), eVar);
        }
        if (field == b51.a.MotherPlaceOfBirthCertificate.EnumC0404a.Number || field == b51.a.FatherPlaceOfBirthCertificate.EnumC0400a.Number) {
            return f(new d.a.C3494a(b0VarG), eVar);
        }
        if (field == b51.a.YourBirthCertificate.EnumC0406a.Number || field == b51.a.MarriageCertificate.EnumC0403a.Number) {
            return f(new d.a.C3494a(b0VarG), eVar);
        }
        if (field == b51.a.FatherName.EnumC0399a.Name) {
            return f(new d.a.e(b0VarG), eVar);
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00db  */
    /* JADX WARN: Code duplicated, block: B:20:0x0112  */
    /* JADX WARN: Code duplicated, block: B:22:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0197  */
    /* JADX WARN: Code duplicated, block: B:25:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00db -> B:18:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0197 -> B:24:0x01b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object e(o31.c.Params r32, tq.e<? super java.util.List<? extends b51.a<?>>> r33) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o31.c.e(o31.c$a, tq.e):java.lang.Object");
    }
}
