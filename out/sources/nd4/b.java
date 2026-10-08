package nd4;

import ci2.PensionerData;
import ei2.RailwayCardWrapped;
import fr.q0;
import gr0.DocumentSchemaAttribute;
import gr0.DocumentSchemaBooleanTranslation;
import gr0.DocumentSchemaEnumTranslation;
import gr0.DynamicDocumentVerificationSchema;
import gr0.MissingDocumentAttribute;
import gv1.s;
import gv1.t;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import jr0.DrivingLicenceScope;
import jr0.NipipScope;
import jr0.PersonalDataScope8;
import ju.p0;
import k34.AdvocateDataModel;
import k34.DeputyCardModel;
import k34.FamilyDataModel;
import k34.JuniorSchoolCardData;
import k34.PensionerCardDocumentData;
import k34.RailwayCardDocumentData;
import k34.StudentCardDocumentData;
import l34.DynamicDocumentVerification;
import mx.Label;
import oq.i0;
import oq.r;
import oq.u;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.data.model.DynamicDocumentVerificationSchemaDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.DrivingLicenceScopeDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.JuniorSchoolCardDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.NipipScopeDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope8Dto;
import vh2.RefugeeWrapped;
import wh2.AdvocateData;
import yh2.DeputyCardWrapped;
import zh2.FamilyData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001d\u0010\u001bJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010\u001bJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b!\u0010\u001bJ$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b#\u0010\u001bJ$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b%\u0010\u001bJ$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b'\u0010\u001bJ$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b)\u0010\u001bJ$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020*0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b+\u0010\u001bJ$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,0\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b-\u0010\u001bJ,\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020/0\u00172\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b0\u00101J$\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002020\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b3\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00107¨\u00068"}, d2 = {"Lnd4/b;", "Lh34/a;", "Lay/j;", "jsonSerializer", "Lez/e;", "dateFormatter", "Lev1/a;", "dynamicDocumentSchemaDecoder", "Lxw/d;", "dispatcherProvider", "<init>", "(Lay/j;Lez/e;Lev1/a;Lxw/d;)V", "Lgr0/v;", "missingAttribute", "", "attributeValue", "q", "(Lgr0/v;Ljava/lang/String;)Ljava/lang/String;", "Lgv1/s;", "defaultValue", "p", "(Lgv1/s;Ljava/lang/String;)Ljava/lang/String;", "data", "Ldx/i;", "Ldx/b;", "Ljr0/j;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljr0/m;", "c", "Lk34/v;", "a", "Lk34/b;", "f", "Lk34/e;", "j", "Lk34/x;", "l", "Lk34/z;", "e", "Lk34/r;", "g", "Ljr0/d;", "b", "Lk34/c0;", "i", "schema", "Ll34/b;", "h", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lo34/c;", "k", "Lay/j;", "Lez/e;", "Lev1/a;", "Lxw/d;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements h34.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ev1.a dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f134377b;

        static {
            int[] iArr = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MissingDocumentAttribute.a.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f134376a = iArr;
            int[] iArr2 = new int[s.values().length];
            try {
                iArr2[s.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[s.DATE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f134377b = iArr2;
        }
    }

    /* JADX INFO: renamed from: nd4.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/b;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C3337b extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends AdvocateDataModel>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134378e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134380g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3337b(String str, tq.e<? super C3337b> eVar) {
            super(2, eVar);
            this.f134380g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134378e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(wh2.b.b((AdvocateData) b.this.jsonSerializer.a(this.f134380g, q0.n(AdvocateData.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, AdvocateDataModel>> eVar) {
            return ((C3337b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new C3337b(this.f134380g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/e;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends DeputyCardModel>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134381e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134383g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f134383g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134381e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(yh2.c.b((DeputyCardWrapped) b.this.jsonSerializer.a(this.f134383g, q0.n(DeputyCardWrapped.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, DeputyCardModel>> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new c(this.f134383g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lo34/c;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends o34.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134384e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134386g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f134386g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134384e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(dj2.a.c((RefugeeWrapped) b.this.jsonSerializer.a(this.f134386g, q0.n(RefugeeWrapped.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, o34.c>> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new d(this.f134386g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Ljr0/d;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends DrivingLicenceScope>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134387e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134389g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f134389g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134387e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(t34.a.c((DrivingLicenceScopeDto) b.this.jsonSerializer.a(this.f134389g, q0.n(DrivingLicenceScopeDto.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, DrivingLicenceScope>> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new e(this.f134389g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Ll34/b;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends DynamicDocumentVerification>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134390e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f134393h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f134392g = str;
            this.f134393h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134390e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                DynamicDocumentVerificationSchema dynamicDocumentVerificationSchemaC = nr0.f.c((DynamicDocumentVerificationSchemaDto) b.this.jsonSerializer.a(this.f134392g, q0.n(DynamicDocumentVerificationSchemaDto.class)));
                DocumentSchemaAttribute expirationDate = dynamicDocumentVerificationSchemaC.getExpirationDate();
                b bVar = b.this;
                String str = this.f134393h;
                MissingDocumentAttribute onMissingAttribute = expirationDate.getOnMissingAttribute();
                ev1.a aVar = bVar.dynamicDocumentSchemaDecoder;
                s sVarE = od4.a.e(expirationDate.getDataType());
                String fieldReference = expirationDate.getFieldReference();
                List<String> listE = expirationDate.e();
                b0 b0VarA = t.a(c0.g(str));
                List<DocumentSchemaEnumTranslation> listC = expirationDate.c();
                String strQ = bVar.q(onMissingAttribute, ev1.a.f(aVar, sVarE, fieldReference, listE, listC != null ? od4.a.b(listC) : null, b0VarA, null, 32, null));
                String strA = b.this.dynamicDocumentSchemaDecoder.a(od4.a.d(dynamicDocumentVerificationSchemaC.d()));
                List<DocumentSchemaAttribute> listA = dynamicDocumentVerificationSchemaC.a();
                b bVar2 = b.this;
                String str2 = this.f134393h;
                ArrayList arrayList = new ArrayList();
                for (DocumentSchemaAttribute documentSchemaAttribute : listA) {
                    MissingDocumentAttribute onMissingAttribute2 = documentSchemaAttribute.getOnMissingAttribute();
                    ev1.a aVar2 = bVar2.dynamicDocumentSchemaDecoder;
                    s sVarE2 = od4.a.e(documentSchemaAttribute.getDataType());
                    String fieldReference2 = documentSchemaAttribute.getFieldReference();
                    List<String> listE2 = documentSchemaAttribute.e();
                    b0 b0VarA2 = t.a(c0.g(str2));
                    List<DocumentSchemaEnumTranslation> listC2 = documentSchemaAttribute.c();
                    List<gv1.DocumentSchemaEnumTranslation> listB = listC2 != null ? od4.a.b(listC2) : null;
                    List<DocumentSchemaBooleanTranslation> listA2 = documentSchemaAttribute.a();
                    String strQ2 = bVar2.q(onMissingAttribute2, aVar2.c(sVarE2, fieldReference2, listE2, listB, b0VarA2, listA2 != null ? od4.a.a(listA2) : null));
                    r rVar = strQ2 != null ? new r(strQ2, bVar2.dynamicDocumentSchemaDecoder.a(od4.a.d(documentSchemaAttribute.g()))) : null;
                    if (rVar != null) {
                        arrayList.add(rVar);
                    }
                }
                return new dx.i.Right(new DynamicDocumentVerification(dynamicDocumentVerificationSchemaC.getDocumentName(), strA, strQ, arrayList));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, DynamicDocumentVerification>> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new f(this.f134392g, this.f134393h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/r;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends FamilyDataModel>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134394e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134396g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f134396g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134394e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(zh2.b.b((FamilyData) b.this.jsonSerializer.a(this.f134396g, q0.n(FamilyData.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, FamilyDataModel>> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new g(this.f134396g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/v;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends JuniorSchoolCardData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134397e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134399g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f134399g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134397e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(t34.b.a((JuniorSchoolCardDto) b.this.jsonSerializer.a(this.f134399g, q0.n(JuniorSchoolCardDto.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, JuniorSchoolCardData>> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new h(this.f134399g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Ljr0/m;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends PersonalDataScope8>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134400e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134402g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f134402g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134400e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(t34.d.i((PersonalDataScope8Dto) b.this.jsonSerializer.a(this.f134402g, q0.n(PersonalDataScope8Dto.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, PersonalDataScope8>> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new i(this.f134402g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Ljr0/j;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends NipipScope>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134403e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134405g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f134405g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134403e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(t34.c.e((NipipScopeDto) b.this.jsonSerializer.a(this.f134405g, q0.n(NipipScopeDto.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, NipipScope>> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new j(this.f134405g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/x;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends PensionerCardDocumentData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134406e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134408g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f134408g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134406e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(ci2.b.b((PensionerData) b.this.jsonSerializer.a(this.f134408g, q0.n(PensionerData.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, PensionerCardDocumentData>> eVar) {
            return ((k) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new k(this.f134408g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/z;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends RailwayCardDocumentData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134409e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134411g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f134411g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134409e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(ei2.b.c((RailwayCardWrapped) b.this.jsonSerializer.a(this.f134411g, q0.n(RailwayCardWrapped.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, RailwayCardDocumentData>> eVar) {
            return ((l) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new l(this.f134411g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/c0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends StudentCardDocumentData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134412e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f134414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f134414g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134412e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new dx.i.Right(di2.b.b((di2.a) b.this.jsonSerializer.a(this.f134414g, q0.n(di2.a.class))));
            } catch (Exception e15) {
                return new dx.i.Left(new dx.b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<dx.b.Generic, StudentCardDocumentData>> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new m(this.f134414g, eVar);
        }
    }

    public b(ay.j jVar, ez.e eVar, ev1.a aVar, xw.d dVar) {
        this.jsonSerializer = jVar;
        this.dateFormatter = eVar;
        this.dynamicDocumentSchemaDecoder = aVar;
        this.dispatcherProvider = dVar;
    }

    private final String p(s sVar, String str) {
        int i15 = a.f134377b[sVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? str : this.dateFormatter.d(new fz.b.String(str, fz.c.OFFSET_DATE_TIME_SEC, false, 4, null), fz.c.DOTTED_TIME_PLUS_DATE);
        }
        return this.dateFormatter.d(new fz.b.String(str, fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q(MissingDocumentAttribute missingAttribute, String attributeValue) {
        s sVarE;
        if (attributeValue == null || fu.r.t0(attributeValue)) {
            attributeValue = null;
        }
        if (attributeValue != null) {
            return attributeValue;
        }
        MissingDocumentAttribute.a onMissing = missingAttribute != null ? missingAttribute.getOnMissing() : null;
        int i15 = onMissing == null ? -1 : a.f134376a[onMissing.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                return Label.INSTANCE.b().getText();
            }
            return null;
        }
        gr0.s dataType = missingAttribute.getDataType();
        if (dataType == null || (sVarE = od4.a.e(dataType)) == null) {
            return null;
        }
        String defaultValue = missingAttribute.getDefaultValue();
        if (defaultValue == null) {
            defaultValue = Label.INSTANCE.c().getText();
        }
        return p(sVarE, defaultValue);
    }

    @Override // h34.a
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, JuniorSchoolCardData>> eVar) {
        return this.dispatcherProvider.d(new h(str, null), eVar);
    }

    @Override // h34.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, DrivingLicenceScope>> eVar) {
        return this.dispatcherProvider.d(new e(str, null), eVar);
    }

    @Override // h34.a
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, PersonalDataScope8>> eVar) {
        return this.dispatcherProvider.d(new i(str, null), eVar);
    }

    @Override // h34.a
    public Object d(String str, tq.e<? super dx.i<? extends dx.b, NipipScope>> eVar) {
        return this.dispatcherProvider.d(new j(str, null), eVar);
    }

    @Override // h34.a
    public Object e(String str, tq.e<? super dx.i<? extends dx.b, RailwayCardDocumentData>> eVar) {
        return this.dispatcherProvider.d(new l(str, null), eVar);
    }

    @Override // h34.a
    public Object f(String str, tq.e<? super dx.i<? extends dx.b, AdvocateDataModel>> eVar) {
        return this.dispatcherProvider.d(new C3337b(str, null), eVar);
    }

    @Override // h34.a
    public Object g(String str, tq.e<? super dx.i<? extends dx.b, FamilyDataModel>> eVar) {
        return this.dispatcherProvider.d(new g(str, null), eVar);
    }

    @Override // h34.a
    public Object h(String str, String str2, tq.e<? super dx.i<? extends dx.b, DynamicDocumentVerification>> eVar) {
        return this.dispatcherProvider.d(new f(str, str2, null), eVar);
    }

    @Override // h34.a
    public Object i(String str, tq.e<? super dx.i<? extends dx.b, StudentCardDocumentData>> eVar) {
        return this.dispatcherProvider.d(new m(str, null), eVar);
    }

    @Override // h34.a
    public Object j(String str, tq.e<? super dx.i<? extends dx.b, DeputyCardModel>> eVar) {
        return this.dispatcherProvider.d(new c(str, null), eVar);
    }

    @Override // h34.a
    public Object k(String str, tq.e<? super dx.i<? extends dx.b, o34.c>> eVar) {
        return this.dispatcherProvider.d(new d(str, null), eVar);
    }

    @Override // h34.a
    public Object l(String str, tq.e<? super dx.i<? extends dx.b, PensionerCardDocumentData>> eVar) {
        return this.dispatcherProvider.d(new k(str, null), eVar);
    }
}
