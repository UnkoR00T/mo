package hp0;

import dx.i;
import er.p;
import fp0.InstitutionCardAndCertData;
import fr.q0;
import iy.e0;
import iy.i0;
import iy.j;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import ju.g2;
import ju.p0;
import ju.w0;
import lp0.InstitutionAndCertDataResponseDto;
import lp0.InstitutionCardDto;
import lp0.InstitutionDataModelDto;
import oq.u;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lhp0/f;", "Lhp0/e;", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Liy/e0;", "signedDataDecoder", "Liy/i0;", "x509CertificateDecoder", "Lay/j;", "jsonSerializer", "<init>", "(Liy/j;Liy/a;Liy/e0;Liy/i0;Lay/j;)V", "Lry/c;", "", "data", "Ldx/i;", "Ldx/b;", "", "g", "(Lry/c;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Llp0/w;", "response", "certKeyPair", "Lfp0/f;", "a", "(Llp0/w;Lry/c;Ltq/e;)Ljava/lang/Object;", "Liy/j;", "b", "Liy/a;", "c", "Liy/e0;", "d", "Liy/i0;", "e", "Lay/j;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j cmsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 signedDataDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i0 x509CertificateDecoder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lfp0/f;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super i<? extends dx.b, ? extends InstitutionCardAndCertData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f86228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f86229h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f86230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f86231k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f86232l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f86233m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f86234n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f86235p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f86236q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f86237r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f86238s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f86239t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f86240v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f86241w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ CertKeyPair f86243y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ InstitutionAndCertDataResponseDto f86244z;

        /* JADX INFO: renamed from: hp0.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Llp0/x;", "<anonymous>", "(Lju/p0;)Llp0/x;"}, k = 3, mv = {2, 2, 0})
        static final class C2010a extends k implements p<p0, tq.e<? super InstitutionCardDto>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f86245e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f86246f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ byte[] f86247g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2010a(f fVar, byte[] bArr, tq.e<? super C2010a> eVar) {
                super(2, eVar);
                this.f86246f = fVar;
                this.f86247g = bArr;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f86245e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                f fVar = this.f86246f;
                Object objA = fVar.jsonSerializer.a(fVar.signedDataDecoder.decode(this.f86247g), q0.n(InstitutionCardDto.class));
                g2.j(getContext());
                return objA;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super InstitutionCardDto> eVar) {
                return ((C2010a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C2010a(this.f86246f, this.f86247g, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Ljava/security/cert/X509Certificate;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class b extends k implements p<p0, tq.e<? super i<? extends dx.b, ? extends X509Certificate>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f86248e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f86249f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ InstitutionDataModelDto f86250g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f fVar, InstitutionDataModelDto institutionDataModelDto, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f86249f = fVar;
                this.f86250g = institutionDataModelDto;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f86248e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return this.f86249f.x509CertificateDecoder.decode(this.f86250g.getCertificate());
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, ? extends X509Certificate>> eVar) {
                return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f86249f, this.f86250g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CertKeyPair certKeyPair, InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f86243y = certKeyPair;
            this.f86244z = institutionAndCertDataResponseDto;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:70:0x0295  */
        /* JADX WARN: Code duplicated, block: B:73:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:74:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:76:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:79:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ju.p0] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            i iVarA;
            Object objB;
            Object objG;
            dx.j<dx.b> jVar;
            int i15;
            int i16;
            ex.b bVar;
            ex.b bVar2;
            ex.b bVar3;
            f fVar;
            InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto;
            int i17;
            int i18;
            int i19;
            f fVar2;
            InstitutionDataModelDto institutionDataModelDto;
            InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto2;
            byte[] bArr;
            ex.b bVar4;
            w0 w0VarB;
            w0 w0VarB2;
            int i25;
            Object objI;
            Object obj2;
            int i26;
            InstitutionDataModelDto institutionDataModelDto2;
            byte[] bArr2;
            w0 w0Var;
            InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto3;
            dx.j<dx.b> jVar2;
            ex.b bVar5;
            X509Certificate x509Certificate;
            Object objI2;
            ?? r15 = (p0) this.f86241w;
            Object objE = uq.b.e();
            int i27 = this.f86240v;
            try {
                try {
                    if (i27 != 0) {
                        if (i27 != 1) {
                            if (i27 == 2) {
                                int i28 = this.f86239t;
                                int i29 = this.f86238s;
                                int i35 = this.f86237r;
                                i26 = this.f86236q;
                                int i36 = this.f86235p;
                                institutionDataModelDto2 = (InstitutionDataModelDto) this.f86233m;
                                w0 w0Var2 = (w0) this.f86232l;
                                w0 w0Var3 = (w0) this.f86231k;
                                bArr2 = (byte[]) this.f86230j;
                                bVar5 = (ex.b) this.f86229h;
                                ex.b bVar6 = (ex.b) this.f86228g;
                                jVar2 = (dx.j) this.f86227f;
                                InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto4 = (InstitutionAndCertDataResponseDto) this.f86226e;
                                try {
                                    u.b(obj);
                                    bVar3 = bVar6;
                                    i19 = i36;
                                    i25 = i28;
                                    institutionAndCertDataResponseDto3 = institutionAndCertDataResponseDto4;
                                    w0VarB = w0Var3;
                                    i15 = i35;
                                    obj2 = objE;
                                    w0Var = w0Var2;
                                    i18 = i29;
                                    objI = obj;
                                } catch (ex.c e15) {
                                    e = e15;
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r15 = jVar2;
                                    px.f fVar3 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar3.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            } else {
                                if (i27 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                X509Certificate x509Certificate2 = (X509Certificate) this.f86233m;
                                institutionAndCertDataResponseDto3 = (InstitutionAndCertDataResponseDto) this.f86226e;
                                try {
                                    u.b(obj);
                                    x509Certificate = x509Certificate2;
                                    objI2 = obj;
                                } catch (ex.c e18) {
                                    e = e18;
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                            }
                            return new i.Left((dx.b) ex.d.a(e));
                        }
                        int i37 = this.f86239t;
                        int i38 = this.f86238s;
                        int i39 = this.f86237r;
                        int i45 = this.f86236q;
                        int i46 = this.f86235p;
                        ex.b bVar7 = (ex.b) this.f86232l;
                        f fVar4 = (f) this.f86231k;
                        ex.b bVar8 = (ex.b) this.f86230j;
                        ex.b bVar9 = (ex.b) this.f86229h;
                        jVar = (dx.j) this.f86228g;
                        InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto5 = (InstitutionAndCertDataResponseDto) this.f86227f;
                        f fVar5 = (f) this.f86226e;
                        try {
                            u.b(obj);
                            bVar3 = bVar9;
                            i16 = i45;
                            institutionAndCertDataResponseDto = institutionAndCertDataResponseDto5;
                            i19 = i46;
                            fVar2 = fVar5;
                            bVar2 = bVar8;
                            i15 = i39;
                            fVar = fVar4;
                            i18 = i38;
                            bVar = bVar7;
                            i17 = i37;
                            objG = obj;
                            Object objA = fVar.jsonSerializer.a(fVar.signedDataDecoder.decode((byte[]) bVar.a((i) objG)), q0.n(InstitutionDataModelDto.class));
                            g2.j(getContext());
                            institutionDataModelDto = (InstitutionDataModelDto) objA;
                            institutionAndCertDataResponseDto2 = institutionAndCertDataResponseDto;
                            bArr = (byte[]) bVar2.a(iy.a.c(fVar2.base64Coder, institutionDataModelDto.getInstitutionSignedCard(), null, 2, null));
                            int i47 = i17;
                            bVar4 = bVar2;
                            w0VarB = ju.k.b(r15, null, null, new b(fVar2, institutionDataModelDto, null), 3, null);
                            w0VarB2 = ju.k.b(r15, null, null, new C2010a(fVar2, bArr, null), 3, null);
                            this.f86241w = vq.j.a(r15);
                            this.f86226e = institutionAndCertDataResponseDto2;
                            this.f86227f = jVar;
                            this.f86228g = vq.j.a(bVar3);
                            this.f86229h = vq.j.a(bVar4);
                            this.f86230j = vq.j.a(bArr);
                            this.f86231k = vq.j.a(w0VarB);
                            this.f86232l = w0VarB2;
                            this.f86233m = vq.j.a(institutionDataModelDto);
                            this.f86235p = i19;
                            this.f86236q = i16;
                            this.f86237r = i15;
                            this.f86238s = i18;
                            i25 = i47;
                            this.f86239t = i25;
                            this.f86240v = 2;
                            objI = w0VarB.I(this);
                            obj2 = objE;
                            if (objI == obj2) {
                                return obj2;
                            }
                            i26 = i16;
                            institutionDataModelDto2 = institutionDataModelDto;
                            bArr2 = bArr;
                            w0Var = w0VarB2;
                            institutionAndCertDataResponseDto3 = institutionAndCertDataResponseDto2;
                            jVar2 = jVar;
                            bVar5 = bVar4;
                        } catch (ex.c e25) {
                            e = e25;
                        } catch (CancellationException e26) {
                            throw e26;
                        } catch (Exception e27) {
                            e = e27;
                            r15 = jVar;
                            px.f fVar6 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar6.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                        return new i.Right(new InstitutionCardAndCertData(kp0.a.e((InstitutionCardDto) objI2), x509Certificate, institutionAndCertDataResponseDto3.getResponseHeader().getRequestId(), institutionAndCertDataResponseDto3.getFormName()));
                    }
                    u.b(obj);
                    f fVar7 = f.this;
                    CertKeyPair certKeyPair = this.f86243y;
                    InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto6 = this.f86244z;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        String institutionData = institutionAndCertDataResponseDto6.getInstitutionData();
                        this.f86241w = r15;
                        this.f86226e = fVar7;
                        this.f86227f = institutionAndCertDataResponseDto6;
                        this.f86228g = jVarA;
                        this.f86229h = vq.j.a(aVar);
                        this.f86230j = aVar;
                        this.f86231k = fVar7;
                        this.f86232l = aVar;
                        this.f86235p = 0;
                        this.f86236q = 0;
                        this.f86237r = 0;
                        this.f86238s = 0;
                        this.f86239t = 0;
                        this.f86240v = 1;
                        objG = fVar7.g(certKeyPair, institutionData, this);
                        if (objG == objE) {
                            return objE;
                        }
                        jVar = jVarA;
                        i15 = 0;
                        i16 = 0;
                        bVar = aVar;
                        bVar2 = bVar;
                        bVar3 = bVar2;
                        fVar = fVar7;
                        institutionAndCertDataResponseDto = institutionAndCertDataResponseDto6;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        fVar2 = fVar;
                        Object objA2 = fVar.jsonSerializer.a(fVar.signedDataDecoder.decode((byte[]) bVar.a((i) objG)), q0.n(InstitutionDataModelDto.class));
                        g2.j(getContext());
                        institutionDataModelDto = (InstitutionDataModelDto) objA2;
                        institutionAndCertDataResponseDto2 = institutionAndCertDataResponseDto;
                        bArr = (byte[]) bVar2.a(iy.a.c(fVar2.base64Coder, institutionDataModelDto.getInstitutionSignedCard(), null, 2, null));
                        int i48 = i17;
                        bVar4 = bVar2;
                        w0VarB = ju.k.b(r15, null, null, new b(fVar2, institutionDataModelDto, null), 3, null);
                        w0VarB2 = ju.k.b(r15, null, null, new C2010a(fVar2, bArr, null), 3, null);
                        this.f86241w = vq.j.a(r15);
                        this.f86226e = institutionAndCertDataResponseDto2;
                        this.f86227f = jVar;
                        this.f86228g = vq.j.a(bVar3);
                        this.f86229h = vq.j.a(bVar4);
                        this.f86230j = vq.j.a(bArr);
                        this.f86231k = vq.j.a(w0VarB);
                        this.f86232l = w0VarB2;
                        this.f86233m = vq.j.a(institutionDataModelDto);
                        this.f86235p = i19;
                        this.f86236q = i16;
                        this.f86237r = i15;
                        this.f86238s = i18;
                        i25 = i48;
                        this.f86239t = i25;
                        this.f86240v = 2;
                        objI = w0VarB.I(this);
                        obj2 = objE;
                        if (objI == obj2) {
                            return obj2;
                        }
                        i26 = i16;
                        institutionDataModelDto2 = institutionDataModelDto;
                        bArr2 = bArr;
                        w0Var = w0VarB2;
                        institutionAndCertDataResponseDto3 = institutionAndCertDataResponseDto2;
                        jVar2 = jVar;
                        bVar5 = bVar4;
                    } catch (ex.c e28) {
                        e = e28;
                    } catch (CancellationException e29) {
                        throw e29;
                    } catch (Exception e35) {
                        e = e35;
                        r15 = jVarA;
                        px.f fVar8 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar8.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                    i iVar = (i) objI;
                    if (iVar instanceof i.Left) {
                        return new i.Left((dx.b) ((i.Left) iVar).b());
                    }
                    if (!(iVar instanceof i.Right)) {
                        throw new oq.p();
                    }
                    x509Certificate = (X509Certificate) ((i.Right) iVar).b();
                    this.f86241w = vq.j.a(r15);
                    this.f86226e = institutionAndCertDataResponseDto3;
                    this.f86227f = jVar2;
                    this.f86228g = vq.j.a(bVar3);
                    this.f86229h = vq.j.a(bVar5);
                    this.f86230j = vq.j.a(bArr2);
                    this.f86231k = vq.j.a(w0VarB);
                    this.f86232l = vq.j.a(w0Var);
                    this.f86233m = x509Certificate;
                    this.f86234n = vq.j.a(institutionDataModelDto2);
                    this.f86235p = i19;
                    this.f86236q = i26;
                    this.f86237r = i15;
                    this.f86238s = i18;
                    this.f86239t = i25;
                    this.f86240v = 3;
                    objI2 = w0Var.I(this);
                    if (objI2 == obj2) {
                        return obj2;
                    }
                    return new i.Right(new InstitutionCardAndCertData(kp0.a.e((InstitutionCardDto) objI2), x509Certificate, institutionAndCertDataResponseDto3.getResponseHeader().getRequestId(), institutionAndCertDataResponseDto3.getFormName()));
                } catch (CancellationException e36) {
                    throw e36;
                }
            } catch (Exception e37) {
                e = e37;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, InstitutionCardAndCertData>> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = f.this.new a(this.f86243y, this.f86244z, eVar);
            aVar.f86241w = obj;
            return aVar;
        }
    }

    public f(j jVar, iy.a aVar, e0 e0Var, i0 i0Var, ay.j jVar2) {
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.signedDataDecoder = e0Var;
        this.x509CertificateDecoder = i0Var;
        this.jsonSerializer = jVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(CertKeyPair certKeyPair, String str, tq.e<? super i<? extends dx.b, byte[]>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    byte[] bArrB = this.cmsManager.b((byte[]) new ex.a().a(iy.a.c(this.base64Coder, str, null, 2, null)), certKeyPair);
                    g2.j(eVar.getContext());
                    return new i.Right(bArrB);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // hp0.e
    public Object a(InstitutionAndCertDataResponseDto institutionAndCertDataResponseDto, CertKeyPair certKeyPair, tq.e<? super i<? extends dx.b, InstitutionCardAndCertData>> eVar) {
        return ju.q0.e(new a(certKeyPair, institutionAndCertDataResponseDto, null), eVar);
    }
}
