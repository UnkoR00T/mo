package mj0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj0.DocumentDto;
import nj0.MyCaseAdditionalDataDto;
import nj0.MyCaseDataDto;
import nj0.MyCasesResponseDto;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import vi0.DocumentData;
import vi0.MyCase;
import vi0.MyCaseAdditionalData;
import vi0.MyCasesPage;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnj0/e0;", "Lvi0/d;", "e", "(Lnj0/e0;)Lvi0/d;", "Lnj0/d0;", "Lvi0/b;", "c", "(Lnj0/d0;)Lvi0/b;", "Lnj0/d0$b;", "Lvi0/b$b;", "b", "(Lnj0/d0$b;)Lvi0/b$b;", "Lnj0/d0$a;", "Lvi0/b$a;", "a", "(Lnj0/d0$a;)Lvi0/b$a;", "Lnj0/c0;", "Lvi0/c;", "d", "(Lnj0/c0;)Lvi0/c;", "citizenservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: mj0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3120a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f126718b;

        static {
            int[] iArr = new int[MyCaseDataDto.b.values().length];
            try {
                iArr[MyCaseDataDto.b.PROCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyCaseDataDto.b.TASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MyCaseDataDto.b.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MyCaseDataDto.b.OLD_PROCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MyCaseDataDto.b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f126717a = iArr;
            int[] iArr2 = new int[MyCaseDataDto.a.values().length];
            try {
                iArr2[MyCaseDataDto.a.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MyCaseDataDto.a.RED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MyCaseDataDto.a.ORANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MyCaseDataDto.a.BLUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MyCaseDataDto.a.YELLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MyCaseDataDto.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            f126718b = iArr2;
        }
    }

    public static final MyCase.a a(MyCaseDataDto.a aVar) {
        switch (aVar == null ? -1 : C3120a.f126718b[aVar.ordinal()]) {
            case 1:
                return MyCase.a.GREEN;
            case 2:
                return MyCase.a.RED;
            case 3:
                return MyCase.a.ORANGE;
            case 4:
                return MyCase.a.BLUE;
            case 5:
                return MyCase.a.YELLOW;
            case 6:
                return MyCase.a.UNKNOWN;
            default:
                return MyCase.a.UNKNOWN;
        }
    }

    public static final MyCase.EnumC5414b b(MyCaseDataDto.b bVar) {
        int i15 = C3120a.f126717a[bVar.ordinal()];
        if (i15 == 1) {
            return MyCase.EnumC5414b.PROCESS;
        }
        if (i15 == 2) {
            return MyCase.EnumC5414b.TASK;
        }
        if (i15 == 3) {
            return MyCase.EnumC5414b.INFO;
        }
        if (i15 == 4) {
            return MyCase.EnumC5414b.OLD_PROCESS;
        }
        if (i15 == 5) {
            return MyCase.EnumC5414b.UNKNOWN;
        }
        throw new p();
    }

    public static final MyCase c(MyCaseDataDto myCaseDataDto) {
        return new MyCase(myCaseDataDto.getId(), myCaseDataDto.getName(), myCaseDataDto.getStatus(), b(myCaseDataDto.getType()), a(myCaseDataDto.getLabelColor()), myCaseDataDto.getReceiverOrganizationName(), myCaseDataDto.getReceiverOrganizationAddress(), myCaseDataDto.getLastModificationDate(), myCaseDataDto.getCreationDate());
    }

    public static final MyCaseAdditionalData d(MyCaseAdditionalDataDto myCaseAdditionalDataDto) {
        String statusDescription = myCaseAdditionalDataDto.getStatusDescription();
        String caseContentDescription = myCaseAdditionalDataDto.getCaseContentDescription();
        DocumentDto document = myCaseAdditionalDataDto.getDocument();
        return new MyCaseAdditionalData(statusDescription, caseContentDescription, new DocumentData(document != null ? document.getName() : null));
    }

    public static final MyCasesPage e(MyCasesResponseDto myCasesResponseDto) {
        List<MyCaseDataDto> listB = myCasesResponseDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(c((MyCaseDataDto) it.next()));
        }
        return new MyCasesPage(arrayList, myCasesResponseDto.getLast(), myCasesResponseDto.getNextPageId());
    }
}
