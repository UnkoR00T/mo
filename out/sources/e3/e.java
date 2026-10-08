package e3;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "Lkotlin/Function0;", "Le3/a;", "trace", "", "d", "(Ljava/lang/Throwable;Ler/a;)Z", "b", "(Ljava/lang/Throwable;Ler/a;)Ljava/lang/Throwable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Loq/i0;", "a", "(Ljava/lang/StringBuilder;Le3/a;)V", "", "Le3/d;", "c", "(Le3/a;)Ljava/util/List;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[PHI: r9
      0x003d: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v13 java.lang.String) binds: [B:7:0x002a, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(StringBuilder sb5, a aVar) {
        List listC = pq.v.c();
        List listS = pq.v.S(aVar.a());
        int size = listS.size();
        String str = null;
        String str2 = null;
        for (int i15 = 0; i15 < size; i15++) {
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) listS.get(i15);
            a0 sourceInfo = composeStackTraceFrame.getSourceInfo();
            if (sourceInfo != null) {
                String functionName = sourceInfo.getFunctionName();
                if (functionName != null) {
                    str = functionName;
                } else {
                    functionName = sourceInfo.getIsCall() ? "<lambda>" : null;
                    if (functionName != null) {
                        str = functionName;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                }
                String sourceFile = sourceInfo.getSourceFile();
                if (sourceFile != null) {
                    str2 = sourceFile;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List<t> listB = sourceInfo.b();
                String str3 = str + '(' + str2 + ':' + ((composeStackTraceFrame.getGroupOffset() == null || composeStackTraceFrame.getGroupOffset().intValue() >= listB.size()) ? "<unknown line>" : String.valueOf(listB.get(composeStackTraceFrame.getGroupOffset().intValue()).getLineNumber())) + ')';
                if (!sourceInfo.getIsCall()) {
                }
                if (!fr.t.c(sourceInfo.getFunctionName(), "rememberCompositionContext") || !fr.t.c(sourceInfo.getPackageHash(), "9igjgp")) {
                    listC.add(str3);
                }
            }
        }
        List listS2 = pq.v.S(pq.v.a(listC));
        int size2 = listS2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            String str4 = (String) listS2.get(i16);
            sb5.append("\tat ");
            sb5.append(str4);
            sb5.append('\n');
        }
    }

    public static final Throwable b(Throwable th4, er.a<a> aVar) {
        d(th4, aVar);
        return th4;
    }

    public static final List<ComposeStackTraceFrame> c(a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE};
        int size = aVar.a().size();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (i15 < size) {
            int i16 = i15 + 1;
            ComposeStackTraceFrame composeStackTraceFrame = aVar.a().get(i15);
            if (!pq.n.d0(iArr, composeStackTraceFrame.getGroupKey())) {
                if (composeStackTraceFrame.getGroupKey() == 100) {
                    int i17 = i15 + 2;
                    if (i17 < size && aVar.a().get(i17).getGroupKey() == 1000) {
                        break;
                    }
                    pq.v.N(arrayList);
                } else {
                    arrayList.add(composeStackTraceFrame);
                }
            }
            i15 = i16;
        }
        return arrayList;
    }

    public static final boolean d(Throwable th4, er.a<a> aVar) {
        q qVar;
        List<Throwable> listB = oq.c.b(th4);
        int size = listB.size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            if (listB.get(i15) instanceof q) {
                return false;
            }
        }
        try {
            a aVarA = aVar.a();
            if (aVarA != null) {
                if (aVarA.getHasSourceInformation()) {
                    List<ComposeStackTraceFrame> listA = aVarA.a();
                    int size2 = listA.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (listA.get(i16).getSourceInfo() != null) {
                            z15 = true;
                            break;
                        }
                    }
                } else if (!aVarA.a().isEmpty()) {
                    z15 = true;
                    break;
                }
            }
            qVar = z15 ? new q(aVarA) : null;
        } catch (Throwable th5) {
            qVar = th5;
        }
        if (qVar != null) {
            oq.c.a(th4, qVar);
        }
        return z15;
    }
}
