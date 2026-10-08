package nr0;

import fr0.BEDocumentConfigLabel;
import fr0.DocumentConfig;
import fr0.DocumentMaintenanceBreak;
import fr0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import or0.DocumentMaintenanceBreakDtoDto;
import or0.DocumentTypeConfigDtoDto;
import or0.DocumentsTypeConfigResponseDto;
import or0.LabelDto;
import or0.LabelDtoDto;
import or0.h0;
import or0.u0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0019\u001a\u00020\t*\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lor0/q0;", "", "Lfr0/g;", "g", "(Lor0/q0;)Ljava/util/List;", "Lor0/l0;", "d", "(Lor0/l0;)Lfr0/g;", "Lor0/t0;", "Lfr0/f;", "c", "(Lor0/t0;)Lfr0/f;", "Lor0/h0;", "Lfr0/i;", "f", "(Lor0/h0;)Lfr0/i;", "Lor0/s;", "Lfr0/h;", "e", "(Lor0/s;)Lfr0/h;", "Lor0/u0;", "Lfr0/f$a;", "a", "(Lor0/u0;)Lfr0/f$a;", "Lor0/s0;", "b", "(Lor0/s0;)Lfr0/f;", "offlinedocumentsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f137848b;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.BY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.BY_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137847a = iArr;
            int[] iArr2 = new int[u0.values().length];
            try {
                iArr2[u0.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u0.UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[u0.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[u0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f137848b = iArr2;
        }
    }

    public static final BEDocumentConfigLabel.a a(u0 u0Var) {
        int i15 = a.f137848b[u0Var.ordinal()];
        if (i15 == 1) {
            return BEDocumentConfigLabel.a.PL;
        }
        if (i15 == 2) {
            return BEDocumentConfigLabel.a.UK;
        }
        if (i15 == 3) {
            return BEDocumentConfigLabel.a.EN;
        }
        if (i15 == 4) {
            return BEDocumentConfigLabel.a.UNKNOWN;
        }
        throw new p();
    }

    public static final BEDocumentConfigLabel b(LabelDto labelDto) {
        u0 language = labelDto.getLanguage();
        return new BEDocumentConfigLabel(language != null ? a(language) : null, labelDto.getValue());
    }

    public static final BEDocumentConfigLabel c(LabelDtoDto labelDtoDto) {
        return new BEDocumentConfigLabel(a(labelDtoDto.getLanguage()), labelDtoDto.getValue());
    }

    public static final DocumentConfig d(DocumentTypeConfigDtoDto documentTypeConfigDtoDto) {
        rq0.b bVarH = g.h(documentTypeConfigDtoDto.getDocumentType(), documentTypeConfigDtoDto.getSubtype());
        ArrayList arrayList = null;
        if (bVarH == null) {
            return null;
        }
        boolean enabled = documentTypeConfigDtoDto.getEnabled();
        long asyncDownloadTerminationInterval = documentTypeConfigDtoDto.getAsyncDownloadTerminationInterval();
        String subtype = documentTypeConfigDtoDto.getSubtype();
        boolean dynamic = documentTypeConfigDtoDto.getDynamic();
        DocumentMaintenanceBreakDtoDto maintenanceBreak = documentTypeConfigDtoDto.getMaintenanceBreak();
        DocumentMaintenanceBreak documentMaintenanceBreakE = maintenanceBreak != null ? e(maintenanceBreak) : null;
        List<LabelDtoDto> listA = documentTypeConfigDtoDto.a();
        if (listA != null) {
            List<LabelDtoDto> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((LabelDtoDto) it.next()));
            }
        }
        ArrayList arrayList2 = arrayList;
        List<LabelDtoDto> listK = documentTypeConfigDtoDto.k();
        ArrayList arrayList3 = new ArrayList(v.y(listK, 10));
        Iterator<T> it4 = listK.iterator();
        while (it4.hasNext()) {
            arrayList3.add(c((LabelDtoDto) it4.next()));
        }
        List<LabelDtoDto> listH = documentTypeConfigDtoDto.h();
        ArrayList arrayList4 = new ArrayList(v.y(listH, 10));
        Iterator<T> it5 = listH.iterator();
        while (it5.hasNext()) {
            arrayList4.add(c((LabelDtoDto) it5.next()));
        }
        return new DocumentConfig(asyncDownloadTerminationInterval, bVarH, enabled, arrayList4, arrayList3, arrayList2, subtype, Boolean.valueOf(dynamic), documentMaintenanceBreakE, Boolean.valueOf(documentTypeConfigDtoDto.getAdditionalVerificationRequired()), f(documentTypeConfigDtoDto.getDocumentStoringMode()), Boolean.valueOf(documentTypeConfigDtoDto.getMultipleCreatingNewDocument()));
    }

    public static final DocumentMaintenanceBreak e(DocumentMaintenanceBreakDtoDto documentMaintenanceBreakDtoDto) {
        List<LabelDto> listB = documentMaintenanceBreakDtoDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(b((LabelDto) it.next()));
        }
        List<LabelDto> listA = documentMaintenanceBreakDtoDto.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(b((LabelDto) it4.next()));
        }
        return new DocumentMaintenanceBreak(arrayList, arrayList2);
    }

    public static final i f(h0 h0Var) {
        int i15 = a.f137847a[h0Var.ordinal()];
        if (i15 == 1) {
            return i.BY_ID;
        }
        if (i15 != 2 && i15 != 3) {
            throw new p();
        }
        return i.BY_TYPE;
    }

    public static final List<DocumentConfig> g(DocumentsTypeConfigResponseDto documentsTypeConfigResponseDto) {
        List<DocumentTypeConfigDtoDto> listA = documentsTypeConfigResponseDto.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            DocumentConfig documentConfigD = d((DocumentTypeConfigDtoDto) it.next());
            if (documentConfigD != null) {
                arrayList.add(documentConfigD);
            }
        }
        return arrayList;
    }
}
