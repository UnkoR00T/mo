package pc4;

import i24.NipipCardContainerData;
import java.time.LocalDate;
import java.util.concurrent.CancellationException;
import jr0.MnemonicHeaderContainer;
import jr0.NipipDataContainer;
import jr0.NipipScope;
import p071kotlin.Metadata;
import qy2.Document;
import qy2.MnemonicHeader;
import qy2.NipipCardData;
import qy2.NipipCardScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020 2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0011*\u00020#H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000b*\u00020&H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010*\u001a\u00020\u0019*\u00020)H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020\u001d*\u00020,H\u0002¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Ler0/h;", "Lqy2/b;", "o", "(Ler0/h;)Lqy2/b;", "Lf24/h;", "p", "(Lf24/h;)Lqy2/b;", "Li24/a0;", "", "userPhoto", "documentStatus", "Ldx/i;", "Ldx/b;", "Lqy2/e;", "g", "(Li24/a0;Ljava/lang/String;Lqy2/b;)Ldx/i;", "Lj24/c;", "Lqy2/c;", "e", "(Lj24/c;)Lqy2/c;", "Li24/z$a;", "Lqy2/d$a;", "i", "(Li24/z$a;)Ldx/i;", "Li24/z$b;", "Lqy2/d$b;", "k", "(Li24/z$b;)Lqy2/d$b;", "Li24/z$c;", "Lqy2/d$c;", "m", "(Li24/z$c;)Lqy2/d$c;", "Ljr0/j;", "h", "(Ljr0/j;Ljava/lang/String;Lqy2/b;)Ldx/i;", "Ljr0/f;", "f", "(Ljr0/f;)Lqy2/c;", "Ljr0/i$a;", "j", "(Ljr0/i$a;)Ldx/i;", "Ljr0/i$b;", "l", "(Ljr0/i$b;)Lqy2/d$b;", "Ljr0/i$c;", "n", "(Ljr0/i$c;)Lqy2/d$c;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y6 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f156852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f156853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f156854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f156855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f156856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f156857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f156858h;

        static {
            int[] iArr = new int[er0.h.values().length];
            try {
                iArr[er0.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[er0.h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[er0.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[er0.h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[er0.h.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f156851a = iArr;
            int[] iArr2 = new int[f24.h.values().length];
            try {
                iArr2[f24.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f24.h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f24.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[f24.h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f156852b = iArr2;
            int[] iArr3 = new int[NipipCardContainerData.a.values().length];
            try {
                iArr3[NipipCardContainerData.a.MIDWIFE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NipipCardContainerData.a.NURSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f156853c = iArr3;
            int[] iArr4 = new int[NipipCardContainerData.b.values().length];
            try {
                iArr4[NipipCardContainerData.b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[NipipCardContainerData.b.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[NipipCardContainerData.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            f156854d = iArr4;
            int[] iArr5 = new int[NipipCardContainerData.c.values().length];
            try {
                iArr5[NipipCardContainerData.c.RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[NipipCardContainerData.c.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[NipipCardContainerData.c.UNDER_SUPERVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[NipipCardContainerData.c.FIXED_TERM.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[NipipCardContainerData.c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            f156855e = iArr5;
            int[] iArr6 = new int[NipipDataContainer.a.values().length];
            try {
                iArr6[NipipDataContainer.a.MIDWIFE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[NipipDataContainer.a.NURSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            f156856f = iArr6;
            int[] iArr7 = new int[NipipDataContainer.b.values().length];
            try {
                iArr7[NipipDataContainer.b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[NipipDataContainer.b.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[NipipDataContainer.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            f156857g = iArr7;
            int[] iArr8 = new int[NipipDataContainer.c.values().length];
            try {
                iArr8[NipipDataContainer.c.RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[NipipDataContainer.c.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[NipipDataContainer.c.UNDER_SUPERVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr8[NipipDataContainer.c.FIXED_TERM.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr8[NipipDataContainer.c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            f156858h = iArr8;
        }
    }

    private static final MnemonicHeader e(j24.MnemonicHeader mnemonicHeader) {
        return new MnemonicHeader(mnemonicHeader.getTp(), mnemonicHeader.getStp(), mnemonicHeader.getVer(), mnemonicHeader.getDn(), mnemonicHeader.getSn(), mnemonicHeader.getIsr(), mnemonicHeader.getTs(), mnemonicHeader.getRId(), mnemonicHeader.getIid(), mnemonicHeader.getPe(), mnemonicHeader.getIn(), mnemonicHeader.getId());
    }

    private static final MnemonicHeader f(MnemonicHeaderContainer mnemonicHeaderContainer) {
        return new MnemonicHeader(mnemonicHeaderContainer.getTp(), mnemonicHeaderContainer.getStp(), mnemonicHeaderContainer.getVer(), mnemonicHeaderContainer.getDn(), mnemonicHeaderContainer.getSn(), mnemonicHeaderContainer.getIsr(), mnemonicHeaderContainer.getTs(), mnemonicHeaderContainer.getRId(), mnemonicHeaderContainer.getIid(), mnemonicHeaderContainer.getPe(), mnemonicHeaderContainer.getIn(), mnemonicHeaderContainer.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dx.i<dx.b, NipipCardData> g(i24.NipipCardData nipipCardData, String str, qy2.b bVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    Document document = new Document(nipipCardData.getDocument().getDocumentId(), nipipCardData.getDocument().getParentCertificateId(), bVar, nipipCardData.getDocument().getExpirationDate(), nipipCardData.getDocument().getLastUpdateTimestamp());
                    MnemonicHeader mnemonicHeaderE = e(nipipCardData.getScope().getDataHeader());
                    iy.b0 name = nipipCardData.getScope().getData().getName();
                    iy.b0 surname = nipipCardData.getScope().getData().getSurname();
                    iy.b0 pesel = nipipCardData.getScope().getData().getPesel();
                    String professionalTitle = nipipCardData.getScope().getData().getProfessionalTitle();
                    String documentName = nipipCardData.getScope().getData().getDocumentName();
                    String documentNumber = nipipCardData.getScope().getData().getDocumentNumber();
                    String issuerName = nipipCardData.getScope().getData().getIssuerName();
                    LocalDate creationDate = nipipCardData.getScope().getData().getCreationDate();
                    qy2.NipipCardContainerData.a aVar2 = (qy2.NipipCardContainerData.a) aVar.a(i(nipipCardData.getScope().getData().getPwzType()));
                    qy2.NipipCardContainerData.b bVarK = k(nipipCardData.getScope().getData().getRestriction());
                    iy.b0 secondName = nipipCardData.getScope().getData().getSecondName();
                    NipipCardContainerData.c restrictionType = nipipCardData.getScope().getData().getRestrictionType();
                    return new dx.i.Right(new NipipCardData(document, new NipipCardScope(mnemonicHeaderE, new qy2.NipipCardContainerData(name, surname, pesel, professionalTitle, documentName, documentNumber, issuerName, creationDate, aVar2, bVarK, secondName, restrictionType != null ? m(restrictionType) : null, str)), bVar));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dx.i<dx.b, NipipCardData> h(NipipScope nipipScope, String str, qy2.b bVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    MnemonicHeader mnemonicHeaderF = f(nipipScope.getDh());
                    iy.b0 name = nipipScope.getDc().getName();
                    iy.b0 surname = nipipScope.getDc().getSurname();
                    iy.b0 pesel = nipipScope.getDc().getPesel();
                    String professionalTitle = nipipScope.getDc().getProfessionalTitle();
                    String documentName = nipipScope.getDc().getDocumentName();
                    String documentNumber = nipipScope.getDc().getDocumentNumber();
                    String issuerName = nipipScope.getDc().getIssuerName();
                    LocalDate creationDate = nipipScope.getDc().getCreationDate();
                    qy2.NipipCardContainerData.a aVar2 = (qy2.NipipCardContainerData.a) aVar.a(j(nipipScope.getDc().getPwzType()));
                    qy2.NipipCardContainerData.b bVarL = l(nipipScope.getDc().getRestriction());
                    iy.b0 secondName = nipipScope.getDc().getSecondName();
                    NipipDataContainer.c restrictionType = nipipScope.getDc().getRestrictionType();
                    return new dx.i.Right(new NipipCardData(null, new NipipCardScope(mnemonicHeaderF, new qy2.NipipCardContainerData(name, surname, pesel, professionalTitle, documentName, documentNumber, issuerName, creationDate, aVar2, bVarL, secondName, restrictionType != null ? n(restrictionType) : null, str)), bVar));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private static final dx.i<dx.b, qy2.NipipCardContainerData.a> i(NipipCardContainerData.a aVar) {
        Object objB;
        qy2.NipipCardContainerData.a aVar2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar3 = new ex.a();
                    int i15 = a.f156853c[aVar.ordinal()];
                    if (i15 == 1) {
                        aVar2 = qy2.NipipCardContainerData.a.MIDWIFE;
                    } else {
                        if (i15 != 2) {
                            aVar3.b(new dx.b.Generic(new IllegalArgumentException("Unknown PwzType: " + aVar3)));
                            throw new oq.g();
                        }
                        aVar2 = qy2.NipipCardContainerData.a.NURSE;
                    }
                    return new dx.i.Right(aVar2);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private static final dx.i<dx.b, qy2.NipipCardContainerData.a> j(NipipDataContainer.a aVar) {
        Object objB;
        qy2.NipipCardContainerData.a aVar2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar3 = new ex.a();
                    int i15 = a.f156856f[aVar.ordinal()];
                    if (i15 == 1) {
                        aVar2 = qy2.NipipCardContainerData.a.MIDWIFE;
                    } else {
                        if (i15 != 2) {
                            aVar3.b(new dx.b.Generic(new IllegalArgumentException("Unknown PwzType: " + aVar3)));
                            throw new oq.g();
                        }
                        aVar2 = qy2.NipipCardContainerData.a.NURSE;
                    }
                    return new dx.i.Right(aVar2);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private static final qy2.NipipCardContainerData.b k(NipipCardContainerData.b bVar) {
        int i15 = a.f156854d[bVar.ordinal()];
        if (i15 == 1) {
            return qy2.NipipCardContainerData.b.FULL;
        }
        if (i15 == 2) {
            return qy2.NipipCardContainerData.b.PARTIAL;
        }
        if (i15 == 3) {
            return qy2.NipipCardContainerData.b.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final qy2.NipipCardContainerData.b l(NipipDataContainer.b bVar) {
        int i15 = a.f156857g[bVar.ordinal()];
        if (i15 == 1) {
            return qy2.NipipCardContainerData.b.FULL;
        }
        if (i15 == 2) {
            return qy2.NipipCardContainerData.b.PARTIAL;
        }
        if (i15 == 3) {
            return qy2.NipipCardContainerData.b.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final qy2.NipipCardContainerData.c m(NipipCardContainerData.c cVar) {
        int i15 = a.f156855e[cVar.ordinal()];
        if (i15 == 1) {
            return qy2.NipipCardContainerData.c.RANGE;
        }
        if (i15 == 2) {
            return qy2.NipipCardContainerData.c.INDIVIDUAL;
        }
        if (i15 == 3) {
            return qy2.NipipCardContainerData.c.UNDER_SUPERVISION;
        }
        if (i15 == 4) {
            return qy2.NipipCardContainerData.c.FIXED_TERM;
        }
        if (i15 == 5) {
            return qy2.NipipCardContainerData.c.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final qy2.NipipCardContainerData.c n(NipipDataContainer.c cVar) {
        int i15 = a.f156858h[cVar.ordinal()];
        if (i15 == 1) {
            return qy2.NipipCardContainerData.c.RANGE;
        }
        if (i15 == 2) {
            return qy2.NipipCardContainerData.c.INDIVIDUAL;
        }
        if (i15 == 3) {
            return qy2.NipipCardContainerData.c.UNDER_SUPERVISION;
        }
        if (i15 == 4) {
            return qy2.NipipCardContainerData.c.FIXED_TERM;
        }
        if (i15 == 5) {
            return qy2.NipipCardContainerData.c.UNKNOWN;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qy2.b o(er0.h hVar) {
        int i15 = a.f156851a[hVar.ordinal()];
        if (i15 == 1) {
            return qy2.b.ACTIVE;
        }
        if (i15 == 2) {
            return qy2.b.INACTIVE;
        }
        if (i15 == 3) {
            return qy2.b.EXPIRED;
        }
        if (i15 == 4) {
            return qy2.b.REVOKED;
        }
        if (i15 == 5) {
            return qy2.b.ACTIVE;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qy2.b p(f24.h hVar) {
        int i15 = a.f156852b[hVar.ordinal()];
        if (i15 == 1) {
            return qy2.b.ACTIVE;
        }
        if (i15 == 2) {
            return qy2.b.INACTIVE;
        }
        if (i15 == 3) {
            return qy2.b.EXPIRED;
        }
        if (i15 == 4) {
            return qy2.b.REVOKED;
        }
        throw new oq.p();
    }
}
