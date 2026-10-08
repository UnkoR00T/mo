package vp;

import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b> f207810a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f207811a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f207812b;

        a() {
        }

        void a(d dVar) {
            this.f207811a.add(dVar);
        }

        float b(lp.r rVar, float f15) {
            float f16 = f15 / 1000.0f;
            float fFloatValue = 0.0f;
            int i15 = 0;
            for (d dVar : this.f207811a) {
                fFloatValue += ((Float) dVar.a().getIterator().getAttribute(c.f207814a)).floatValue();
                String strB = dVar.b();
                if (i15 == this.f207811a.size() - 1 && Character.isWhitespace(strB.charAt(strB.length() - 1))) {
                    fFloatValue -= rVar.m(strB.substring(strB.length() - 1)) * f16;
                }
                i15++;
            }
            return fFloatValue;
        }

        float c(float f15) {
            return (f15 - this.f207812b) / (this.f207811a.size() - 1);
        }

        float d() {
            return this.f207812b;
        }

        List<d> e() {
            return this.f207811a;
        }

        void f(float f15) {
            this.f207812b = f15;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f207813a;

        b(String str) {
            this.f207813a = str;
        }

        List<a> a(lp.r rVar, float f15, float f16) {
            String strSubstring;
            BreakIterator lineInstance = BreakIterator.getLineInstance();
            lineInstance.setText(this.f207813a);
            float f17 = f15 / 1000.0f;
            int iFirst = lineInstance.first();
            int next = lineInstance.next();
            ArrayList arrayList = new ArrayList();
            a aVar = new a();
            float fM = 0.0f;
            while (next != -1) {
                String strSubstring2 = this.f207813a.substring(iFirst, next);
                float fM2 = rVar.m(strSubstring2) * f17;
                int i15 = next - iFirst;
                fM += fM2;
                boolean z15 = true;
                if (fM >= f16 && Character.isWhitespace(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    fM -= rVar.m(strSubstring2.substring(strSubstring2.length() - 1)) * f17;
                }
                if (fM >= f16 && !aVar.e().isEmpty()) {
                    aVar.f(aVar.b(rVar, f15));
                    arrayList.add(aVar);
                    aVar = new a();
                    fM = rVar.m(strSubstring2) * f17;
                }
                if (fM2 <= f16 || !aVar.e().isEmpty()) {
                    z15 = false;
                } else {
                    do {
                        i15--;
                        strSubstring = strSubstring2.substring(0, i15);
                    } while (rVar.m(strSubstring) * f17 >= f16);
                    fM2 = rVar.m(strSubstring) * f17;
                    strSubstring2 = strSubstring;
                    fM = fM2;
                }
                AttributedString attributedString = new AttributedString(strSubstring2);
                attributedString.addAttribute(c.f207814a, Float.valueOf(fM2));
                d dVar = new d(strSubstring2);
                dVar.c(attributedString);
                aVar.a(dVar);
                if (z15) {
                    iFirst += i15;
                } else {
                    int i16 = next;
                    next = lineInstance.next();
                    iFirst = i16;
                }
            }
            aVar.f(aVar.b(rVar, f15));
            arrayList.add(aVar);
            return arrayList;
        }

        String b() {
            return this.f207813a;
        }
    }

    static class c extends AttributedCharacterIterator.Attribute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AttributedCharacterIterator.Attribute f207814a = new c("width");

        protected c(String str) {
            super(str);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AttributedString f207815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f207816b;

        d(String str) {
            this.f207816b = str;
        }

        AttributedString a() {
            return this.f207815a;
        }

        String b() {
            return this.f207816b;
        }

        void c(AttributedString attributedString) {
            this.f207815a = attributedString;
        }
    }

    u(String str) {
        if (str.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            this.f207810a = arrayList;
            arrayList.add(new b(""));
            return;
        }
        String[] strArrSplit = str.replace('\t', ' ').split("\\r\\n|\\n|\\r|\\u2028|\\u2029");
        this.f207810a = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (str2.length() == 0) {
                str2 = " ";
            }
            this.f207810a.add(new b(str2));
        }
    }

    List<b> a() {
        return this.f207810a;
    }
}
