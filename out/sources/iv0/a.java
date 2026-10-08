package iv0;

import dx.i;
import dx.j;
import ex.d;
import fv0.BEDiploma;
import fv0.BEDiplomasByLanguage;
import fv0.BEDiplomasToDownload;
import fv0.b;
import fv0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jv0.GetDiplomaDocumentsToDownloadResponse;
import jv0.GetDiplomaDocumentsToDownloadResponseDiplomaDto;
import jv0.GetDiplomaDocumentsToDownloadResponseDiplomasByLanguageDto;
import jv0.g;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import px.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\t*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\t*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t*\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\t*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfv0/c;", "Ljv0/c;", "h", "(Lfv0/c;)Ljv0/c;", "Lfv0/b;", "Ljv0/b;", "g", "(Lfv0/b;)Ljv0/b;", "Ljv0/d;", "Ldx/i;", "Ldx/b;", "Lfv0/e;", "c", "(Ljv0/d;)Ldx/i;", "Ljv0/f;", "Lfv0/d;", "e", "(Ljv0/f;)Ldx/i;", "Ljv0/e;", "Lfv0/a;", "d", "(Ljv0/e;)Ldx/i;", "Ljv0/a;", "Lfv0/d$a;", "a", "(Ljv0/a;)Ldx/i;", "b", "(Ljv0/b;)Ldx/i;", "Ljv0/g;", "Lfv0/a$a;", "f", "(Ljv0/g;)Ldx/i;", "universityservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: iv0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2276a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f97202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f97203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f97204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f97205e;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.GRADUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.PHD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.DSC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97201a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.SUPPLEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.SUPPLEMENT_COPY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f97202b = iArr2;
            int[] iArr3 = new int[jv0.a.values().length];
            try {
                iArr3[jv0.a.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[jv0.a.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[jv0.a.DE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[jv0.a.FR.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[jv0.a.ES.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[jv0.a.RU.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[jv0.a.LA.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[jv0.a.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            f97203c = iArr3;
            int[] iArr4 = new int[jv0.b.values().length];
            try {
                iArr4[jv0.b.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[jv0.b.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[jv0.b.SUPPLEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[jv0.b.SUPPLEMENT_COPY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[jv0.b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f97204d = iArr4;
            int[] iArr5 = new int[g.values().length];
            try {
                iArr5[g.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[g.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[g.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[g.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[g.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            f97205e = iArr5;
        }
    }

    public static final i<dx.b, BEDiplomasByLanguage.a> a(jv0.a aVar) {
        Object objB;
        BEDiplomasByLanguage.a aVar2;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar3 = new ex.a();
                    switch (C2276a.f97203c[aVar.ordinal()]) {
                        case 1:
                            aVar2 = BEDiplomasByLanguage.a.PL;
                            break;
                        case 2:
                            aVar2 = BEDiplomasByLanguage.a.EN;
                            break;
                        case 3:
                            aVar2 = BEDiplomasByLanguage.a.DE;
                            break;
                        case 4:
                            aVar2 = BEDiplomasByLanguage.a.FR;
                            break;
                        case 5:
                            aVar2 = BEDiplomasByLanguage.a.ES;
                            break;
                        case 6:
                            aVar2 = BEDiplomasByLanguage.a.RU;
                            break;
                        case 7:
                            aVar2 = BEDiplomasByLanguage.a.LA;
                            break;
                        case 8:
                            aVar3.b(new dx.b.Parsing(null, 1, null));
                            throw new oq.g();
                        default:
                            throw new p();
                    }
                    return new i.Right(aVar2);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
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
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, b> b(jv0.b bVar) {
        Object objB;
        b bVar2;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C2276a.f97204d[bVar.ordinal()];
                    if (i15 == 1) {
                        bVar2 = b.ORIGINAL;
                    } else if (i15 == 2) {
                        bVar2 = b.COPY;
                    } else if (i15 == 3) {
                        bVar2 = b.SUPPLEMENT;
                    } else {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(null, 1, null));
                            throw new oq.g();
                        }
                        bVar2 = b.SUPPLEMENT_COPY;
                    }
                    return new i.Right(bVar2);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
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
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, BEDiplomasToDownload> c(GetDiplomaDocumentsToDownloadResponse getDiplomaDocumentsToDownloadResponse) {
        Object objB;
        i right;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<GetDiplomaDocumentsToDownloadResponseDiplomasByLanguageDto> listA = getDiplomaDocumentsToDownloadResponse.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        i<dx.b, BEDiplomasByLanguage> iVarE = e((GetDiplomaDocumentsToDownloadResponseDiplomasByLanguageDto) it.next());
                        if (iVarE instanceof i.Left) {
                            right = new i.Left(((i.Left) iVarE).b());
                            return new i.Right(new BEDiplomasToDownload((List) aVar.a(right)));
                        }
                        if (!(iVarE instanceof i.Right)) {
                            throw new p();
                        }
                        arrayList.add(((i.Right) iVarE).b());
                    }
                    right = new i.Right(arrayList);
                    return new i.Right(new BEDiplomasToDownload((List) aVar.a(right)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, BEDiploma> d(GetDiplomaDocumentsToDownloadResponseDiplomaDto getDiplomaDocumentsToDownloadResponseDiplomaDto) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new i.Right(new BEDiploma(getDiplomaDocumentsToDownloadResponseDiplomaDto.getDiplomaUuid(), (b) aVar.a(b(getDiplomaDocumentsToDownloadResponseDiplomaDto.getDiplomaSubtype())), (BEDiploma.EnumC1516a) aVar.a(f(getDiplomaDocumentsToDownloadResponseDiplomaDto.getGenerationStatus()))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, BEDiplomasByLanguage> e(GetDiplomaDocumentsToDownloadResponseDiplomasByLanguageDto getDiplomaDocumentsToDownloadResponseDiplomasByLanguageDto) {
        Object objB;
        i right;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEDiplomasByLanguage.a aVar2 = (BEDiplomasByLanguage.a) aVar.a(a(getDiplomaDocumentsToDownloadResponseDiplomasByLanguageDto.getLanguageCode()));
                    List<GetDiplomaDocumentsToDownloadResponseDiplomaDto> listA = getDiplomaDocumentsToDownloadResponseDiplomasByLanguageDto.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        i<dx.b, BEDiploma> iVarD = d((GetDiplomaDocumentsToDownloadResponseDiplomaDto) it.next());
                        if (iVarD instanceof i.Left) {
                            right = new i.Left(((i.Left) iVarD).b());
                            return new i.Right(new BEDiplomasByLanguage(aVar2, (List) aVar.a(right)));
                        }
                        if (!(iVarD instanceof i.Right)) {
                            throw new p();
                        }
                        arrayList.add(((i.Right) iVarD).b());
                    }
                    right = new i.Right(arrayList);
                    return new i.Right(new BEDiplomasByLanguage(aVar2, (List) aVar.a(right)));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
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
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, BEDiploma.EnumC1516a> f(g gVar) {
        Object objB;
        BEDiploma.EnumC1516a enumC1516a;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C2276a.f97205e[gVar.ordinal()];
                    if (i15 == 1) {
                        enumC1516a = BEDiploma.EnumC1516a.NONE;
                    } else if (i15 == 2) {
                        enumC1516a = BEDiploma.EnumC1516a.IN_PROGRESS;
                    } else if (i15 == 3) {
                        enumC1516a = BEDiploma.EnumC1516a.SUCCESS;
                    } else {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(null, 1, null));
                            throw new oq.g();
                        }
                        enumC1516a = BEDiploma.EnumC1516a.ERROR;
                    }
                    return new i.Right(enumC1516a);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
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
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final jv0.b g(b bVar) {
        int i15 = C2276a.f97202b[bVar.ordinal()];
        if (i15 == 1) {
            return jv0.b.ORIGINAL;
        }
        if (i15 == 2) {
            return jv0.b.COPY;
        }
        if (i15 == 3) {
            return jv0.b.SUPPLEMENT;
        }
        if (i15 == 4) {
            return jv0.b.SUPPLEMENT_COPY;
        }
        throw new p();
    }

    public static final jv0.c h(c cVar) {
        int i15 = C2276a.f97201a[cVar.ordinal()];
        if (i15 == 1) {
            return jv0.c.GRADUATION;
        }
        if (i15 == 2) {
            return jv0.c.PHD;
        }
        if (i15 == 3) {
            return jv0.c.DSC;
        }
        throw new p();
    }
}
