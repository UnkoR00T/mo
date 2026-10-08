package oo;

import io.sentry.android.core.c2;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f147248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f147249b;

    public u(String str, String str2) {
        this.f147248a = str;
        this.f147249b = str2;
    }

    private List<Object> b(byte[] bArr, List<byte[]> list, List<Object> list2) throws EOFException {
        r rVar = new r(bArr);
        while (rVar.b()) {
            int iK = rVar.k();
            if (iK == 10) {
                Object objRemove = list2.remove(list2.size() - 1);
                if (objRemove instanceof Integer) {
                    Integer num = (Integer) objRemove;
                    if (num.intValue() < 0 || num.intValue() >= list.size()) {
                        c2.g("PdfBox-Android", "CALLSUBR is ignored, operand: " + num + ", subrs.size(): " + list.size() + " in glyph '" + this.f147249b + "' of font " + this.f147248a);
                        while (list2.get(list2.size() - 1) instanceof Integer) {
                            list2.remove(list2.size() - 1);
                        }
                    } else {
                        b(list.get(num.intValue()), list, list2);
                        Object obj = list2.get(list2.size() - 1);
                        if ((obj instanceof p) && ((p) obj).a().a()[0] == 11) {
                            list2.remove(list2.size() - 1);
                        }
                    }
                } else {
                    c2.g("PdfBox-Android", "Parameter " + objRemove + " for CALLSUBR is ignored, integer expected in glyph '" + this.f147249b + "' of font " + this.f147248a);
                }
            } else if (iK == 12 && rVar.e(0) == 16) {
                rVar.g();
                Integer num2 = (Integer) list2.remove(list2.size() - 1);
                Integer num3 = (Integer) list2.remove(list2.size() - 1);
                ArrayDeque arrayDeque = new ArrayDeque();
                int iIntValue = num2.intValue();
                if (iIntValue == 0) {
                    arrayDeque.push(e(list2));
                    arrayDeque.push(e(list2));
                    list2.remove(list2.size() - 1);
                    list2.add(0);
                    list2.add(new p(12, 16));
                } else if (iIntValue == 1) {
                    list2.add(1);
                    list2.add(new p(12, 16));
                } else if (iIntValue != 3) {
                    for (int i15 = 0; i15 < num3.intValue(); i15++) {
                        arrayDeque.push(e(list2));
                    }
                } else {
                    arrayDeque.push(e(list2));
                }
                while (rVar.e(0) == 12 && rVar.e(1) == 17) {
                    rVar.g();
                    rVar.g();
                    list2.add(arrayDeque.pop());
                }
                if (arrayDeque.size() > 0) {
                    c2.g("PdfBox-Android", "Value left on the PostScript stack in glyph " + this.f147249b + " of font " + this.f147248a);
                }
            } else if (iK >= 0 && iK <= 31) {
                list2.add(c(rVar, iK));
            } else {
                if (iK < 32 || iK > 255) {
                    throw new IllegalArgumentException();
                }
                list2.add(d(rVar, iK));
            }
        }
        return list2;
    }

    private p c(r rVar, int i15) {
        return i15 == 12 ? new p(i15, rVar.k()) : new p(i15);
    }

    private Integer d(r rVar, int i15) {
        if (i15 >= 32 && i15 <= 246) {
            return Integer.valueOf(i15 - 139);
        }
        if (i15 >= 247 && i15 <= 250) {
            return Integer.valueOf(((i15 - 247) * 256) + rVar.k() + 108);
        }
        if (i15 >= 251 && i15 <= 254) {
            return Integer.valueOf((((-(i15 - 251)) * 256) - rVar.k()) - 108);
        }
        if (i15 == 255) {
            return Integer.valueOf(rVar.i());
        }
        throw new IllegalArgumentException();
    }

    private static Integer e(List<Object> list) throws IOException {
        Object objRemove = list.remove(list.size() - 1);
        if (objRemove instanceof Integer) {
            return (Integer) objRemove;
        }
        p pVar = (p) objRemove;
        if (pVar.a().a()[0] == 12 && pVar.a().a()[1] == 12) {
            return Integer.valueOf(((Integer) list.remove(list.size() - 1)).intValue() / ((Integer) list.remove(list.size() - 1)).intValue());
        }
        throw new IOException("Unexpected char string command: " + pVar.a());
    }

    public List<Object> a(byte[] bArr, List<byte[]> list) {
        return b(bArr, list, new ArrayList());
    }
}
