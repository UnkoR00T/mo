package nr0;

import er0.BEDocumentToGenerate;
import fr0.AsyncDocumentGenerationRequest;
import fr0.BEAsyncDocumentGenerationResponse;
import fr0.DocumentTypeWithSubtype;
import ir0.RefugeeChildPersonalInfo;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import or0.AsyncDocumentGenerationRequestDto;
import or0.AsyncDocumentGenerationResponseDto;
import or0.AsyncJuniorDocumentGenerationResponseDto;
import or0.DocumentToGenerateDtoDto;
import or0.DocumentTypeWithSubtypeDtoDto;
import or0.LoadRefugeeKidDataOutputDtoDto;
import or0.RefugeeKidPersonalInfoDtoDto;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\n*\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0001*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lor0/c;", "Lfr0/c;", "b", "(Lor0/c;)Lfr0/c;", "Lfr0/b;", "Lor0/b;", "f", "(Lfr0/b;)Lor0/b;", "Lor0/v0;", "", "Lir0/a;", "e", "(Lor0/v0;)Ljava/util/List;", "Lor0/f1;", "d", "(Lor0/f1;)Lir0/a;", "Lor0/g;", "c", "(Lor0/g;)Lfr0/c;", "Lfr0/j;", "Lor0/n0;", "g", "(Lfr0/j;)Lor0/n0;", "Lor0/j0;", "Ler0/e;", "a", "(Lor0/j0;)Ler0/e;", "offlinedocumentsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final BEDocumentToGenerate a(DocumentToGenerateDtoDto documentToGenerateDtoDto) {
        String documentId = documentToGenerateDtoDto.getDocumentId();
        rq0.b bVarI = g.i(documentToGenerateDtoDto.getDocumentType(), documentToGenerateDtoDto.getSubType());
        BEDocumentToGenerate.a aVarC = g.c(documentToGenerateDtoDto.getGenerationStatus());
        boolean multiDocument = documentToGenerateDtoDto.getMultiDocument();
        return new BEDocumentToGenerate(documentToGenerateDtoDto.getAsyncDownloadTerminationInterval(), documentId, bVarI, aVarC, documentToGenerateDtoDto.getSubType(), Boolean.valueOf(multiDocument));
    }

    public static final BEAsyncDocumentGenerationResponse b(AsyncDocumentGenerationResponseDto asyncDocumentGenerationResponseDto) {
        String taskId = asyncDocumentGenerationResponseDto.getTaskId();
        List<DocumentToGenerateDtoDto> listA = asyncDocumentGenerationResponseDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(a((DocumentToGenerateDtoDto) it.next()));
        }
        return new BEAsyncDocumentGenerationResponse(taskId, arrayList);
    }

    public static final BEAsyncDocumentGenerationResponse c(AsyncJuniorDocumentGenerationResponseDto asyncJuniorDocumentGenerationResponseDto) {
        return new BEAsyncDocumentGenerationResponse(asyncJuniorDocumentGenerationResponseDto.getTaskId(), v.e(a(asyncJuniorDocumentGenerationResponseDto.getDocumentToGenerate())));
    }

    public static final RefugeeChildPersonalInfo d(RefugeeKidPersonalInfoDtoDto refugeeKidPersonalInfoDtoDto) {
        b0 b0VarG = c0.g(refugeeKidPersonalInfoDtoDto.getFirstName());
        String secondName = refugeeKidPersonalInfoDtoDto.getSecondName();
        return new RefugeeChildPersonalInfo(b0VarG, secondName != null ? c0.g(secondName) : null, c0.g(refugeeKidPersonalInfoDtoDto.getSurname()), c0.g(refugeeKidPersonalInfoDtoDto.getPesel()));
    }

    public static final List<RefugeeChildPersonalInfo> e(LoadRefugeeKidDataOutputDtoDto loadRefugeeKidDataOutputDtoDto) {
        List<RefugeeKidPersonalInfoDtoDto> listA = loadRefugeeKidDataOutputDtoDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(d((RefugeeKidPersonalInfoDtoDto) it.next()));
        }
        return arrayList;
    }

    public static final AsyncDocumentGenerationRequestDto f(AsyncDocumentGenerationRequest asyncDocumentGenerationRequest) {
        Set<DocumentTypeWithSubtype> setA = asyncDocumentGenerationRequest.a();
        ArrayList arrayList = new ArrayList(v.y(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(g((DocumentTypeWithSubtype) it.next()));
        }
        return new AsyncDocumentGenerationRequestDto(null, v.k1(arrayList), 1, null);
    }

    public static final DocumentTypeWithSubtypeDtoDto g(DocumentTypeWithSubtype documentTypeWithSubtype) {
        return new DocumentTypeWithSubtypeDtoDto(documentTypeWithSubtype.getSubtype(), g.j(documentTypeWithSubtype.getType()));
    }
}
