package y41;

import bl0.BEChildBirthParents;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v0;
import wi0.CitizenshipDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u0006*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\t*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0012\u001a\u00020\u0006*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u001a\u001a\u00020\u0006*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\u001e*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"", "Lb51/a;", "Lb51/a$c;", "field", "", "text", "Loq/i0;", "k", "(Ljava/util/List;Lb51/a$c;Ljava/lang/String;)V", "Lfz/b$c;", "date", "i", "(Ljava/util/List;Lb51/a$c;Lfz/b$c;)V", "", "e", "(Ljava/util/List;Lb51/a$c;)Lfz/b$c;", "Lwi0/a;", "data", "g", "(Ljava/util/List;Lwi0/a;)V", "", "f", "(Ljava/util/List;)Z", "Lhz/b;", "state", "enabled", "m", "(Ljava/util/List;Lb51/a$c;Lhz/b;Z)V", "Lxw/e;", "applicantGender", "Lbl0/e;", "p", "(Ljava/util/List;Lxw/e;)Lbl0/e;", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f223955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f223956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f223957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f223958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f223959f;

        static {
            int[] iArr = new int[b51.a.SecondDataParent.EnumC0405a.values().length];
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.FirstName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.SecondName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.NextName.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.LastName.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.FamilyName.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.PESEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.DateOfBirth.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.PlaceOfBirth.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b51.a.SecondDataParent.EnumC0405a.Citizenship.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f223954a = iArr;
            int[] iArr2 = new int[b51.a.MotherPlaceOfBirthCertificate.EnumC0404a.values().length];
            try {
                iArr2[b51.a.MotherPlaceOfBirthCertificate.EnumC0404a.Place.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[b51.a.MotherPlaceOfBirthCertificate.EnumC0404a.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f223955b = iArr2;
            int[] iArr3 = new int[b51.a.FatherPlaceOfBirthCertificate.EnumC0400a.values().length];
            try {
                iArr3[b51.a.FatherPlaceOfBirthCertificate.EnumC0400a.Place.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[b51.a.FatherPlaceOfBirthCertificate.EnumC0400a.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            f223956c = iArr3;
            int[] iArr4 = new int[b51.a.MarriageCertificate.EnumC0403a.values().length];
            try {
                iArr4[b51.a.MarriageCertificate.EnumC0403a.Place.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[b51.a.MarriageCertificate.EnumC0403a.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f223957d = iArr4;
            int[] iArr5 = new int[b51.a.YourBirthCertificate.EnumC0406a.values().length];
            try {
                iArr5[b51.a.YourBirthCertificate.EnumC0406a.Place.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[b51.a.YourBirthCertificate.EnumC0406a.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            f223958e = iArr5;
            int[] iArr6 = new int[b51.a.FatherName.EnumC0399a.values().length];
            try {
                iArr6[b51.a.FatherName.EnumC0399a.Name.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            f223959f = iArr6;
        }
    }

    public static final fz.b.LocalDate e(List<? extends b51.a<?>> list, b51.a.c cVar) {
        Object next;
        b51.a.FieldData fieldData;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pq.v.c0(((b51.a) next).b().keySet(), cVar));
        b51.a aVar = (b51.a) next;
        b51.a.FieldData.InterfaceC0401a value = (aVar == null || (fieldData = (b51.a.FieldData) aVar.b().get(cVar)) == null) ? null : fieldData.getValue();
        b51.a.FieldData.InterfaceC0401a.Date date = value instanceof b51.a.FieldData.InterfaceC0401a.Date ? (b51.a.FieldData.InterfaceC0401a.Date) value : null;
        if (date != null) {
            return date.getData();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[RETURN] */
    public static final boolean f(List<? extends b51.a<?>> list) {
        Object obj;
        Object next;
        Iterator<T> it = list.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                for (Object obj2 : ((b51.a) next).b().values()) {
                    if (!(((b51.a.FieldData) obj2).getValidationState() instanceof hz.b.d)) {
                        obj = obj2;
                        break;
                    }
                }
            }
            if (obj == null) {
                return true;
            }
            return false;
        } while (obj == null);
        obj = next;
        if (obj == null) {
            return true;
        }
        return false;
    }

    public static final void g(List<b51.a<?>> list, final CitizenshipDictionary citizenshipDictionary) {
        final b51.a.SecondDataParent.EnumC0405a enumC0405a = b51.a.SecondDataParent.EnumC0405a.Citizenship;
        list.replaceAll(new UnaryOperator() { // from class: y41.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r0.h(enumC0405a, citizenshipDictionary, (b51.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b51.a h(b51.a.SecondDataParent.EnumC0405a enumC0405a, CitizenshipDictionary citizenshipDictionary, b51.a aVar) {
        b51.a.FieldData fieldData = (b51.a.FieldData) aVar.b().get(enumC0405a);
        if (fieldData == null) {
            return aVar;
        }
        Map<?, b51.a.FieldData> mapW = v0.w(aVar.b());
        mapW.put(enumC0405a, b51.a.FieldData.b(fieldData, null, new b51.a.FieldData.InterfaceC0401a.DropDown(citizenshipDictionary), null, false, 13, null));
        return aVar.c(mapW);
    }

    public static final void i(List<b51.a<?>> list, final b51.a.c cVar, final fz.b.LocalDate localDate) {
        list.replaceAll(new UnaryOperator() { // from class: y41.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r0.j(cVar, localDate, (b51.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b51.a j(b51.a.c cVar, fz.b.LocalDate localDate, b51.a aVar) {
        b51.a.FieldData fieldDataB;
        if (!pq.v.c0(aVar.b().keySet(), cVar)) {
            return aVar;
        }
        Map<?, b51.a.FieldData> mapW = v0.w(aVar.b());
        b51.a.FieldData fieldData = mapW.get(cVar);
        if (fieldData != null && (fieldDataB = b51.a.FieldData.b(fieldData, null, new b51.a.FieldData.InterfaceC0401a.Date(localDate), null, false, 13, null)) != null) {
            mapW.put(cVar, fieldDataB);
        }
        return aVar.c(mapW);
    }

    public static final void k(List<b51.a<?>> list, final b51.a.c cVar, final String str) {
        list.replaceAll(new UnaryOperator() { // from class: y41.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r0.l(cVar, str, (b51.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b51.a l(b51.a.c cVar, String str, b51.a aVar) {
        if (!pq.v.c0(aVar.b().keySet(), cVar)) {
            return aVar;
        }
        Map<?, b51.a.FieldData> mapW = v0.w(aVar.b());
        b51.a.FieldData fieldData = mapW.get(cVar);
        if (fieldData != null && (fieldData.getValue() instanceof b51.a.FieldData.InterfaceC0401a.Text)) {
            mapW.put(cVar, b51.a.FieldData.b(fieldData, null, b51.a.FieldData.InterfaceC0401a.Text.b((b51.a.FieldData.InterfaceC0401a.Text) fieldData.getValue(), iy.c0.g(str), null, 2, null), null, false, 13, null));
        }
        return aVar.c(mapW);
    }

    public static final void m(List<b51.a<?>> list, final b51.a.c cVar, final hz.b bVar, final boolean z15) {
        list.replaceAll(new UnaryOperator() { // from class: y41.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r0.o(cVar, bVar, z15, (b51.a) obj);
            }
        });
    }

    public static /* synthetic */ void n(List list, b51.a.c cVar, hz.b bVar, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        m(list, cVar, bVar, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b51.a o(b51.a.c cVar, hz.b bVar, boolean z15, b51.a aVar) {
        b51.a.FieldData fieldDataB;
        if (!pq.v.c0(aVar.b().keySet(), cVar)) {
            return aVar;
        }
        Map<?, b51.a.FieldData> mapW = v0.w(aVar.b());
        b51.a.FieldData fieldData = mapW.get(cVar);
        if (fieldData != null && (fieldDataB = b51.a.FieldData.b(fieldData, null, null, bVar, z15, 3, null)) != null) {
            mapW.put(cVar, fieldDataB);
        }
        return aVar.c(mapW);
    }

    public static final BEChildBirthParents p(List<? extends b51.a<?>> list, xw.e eVar) {
        BEChildBirthParents.SecondParent secondParentB;
        String name;
        BEChildBirthParents bEChildBirthParentsB;
        BEChildBirthParents.BirthCertificate birthCertificateB;
        BEChildBirthParents.BirthCertificate birthCertificateB2;
        BEChildBirthParents.MarriageCertificate marriageCertificateB;
        BEChildBirthParents.BirthCertificate birthCertificateB3;
        BEChildBirthParents bEChildBirthParents = new BEChildBirthParents(eVar, null, null, null, null, null, 62, null);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b51.a aVar = (b51.a) it.next();
            if (aVar instanceof b51.a.SecondDataParent) {
                BEChildBirthParents.SecondParent secondParent = bEChildBirthParents.getSecondParent();
                if (secondParent == null) {
                    secondParent = new BEChildBirthParents.SecondParent(null, null, null, null, null, null, null, null, null, 511, null);
                }
                BEChildBirthParents bEChildBirthParentsB2 = bEChildBirthParents;
                BEChildBirthParents.SecondParent secondParent2 = secondParent;
                for (Map.Entry<b51.a.SecondDataParent.EnumC0405a, b51.a.FieldData> entry : ((b51.a.SecondDataParent) aVar).b().entrySet()) {
                    b51.a.SecondDataParent.EnumC0405a key = entry.getKey();
                    b51.a.FieldData value = entry.getValue();
                    b51.a.FieldData.InterfaceC0401a value2 = value.getValue();
                    b51.a.FieldData.InterfaceC0401a.Text text = value2 instanceof b51.a.FieldData.InterfaceC0401a.Text ? (b51.a.FieldData.InterfaceC0401a.Text) value2 : null;
                    iy.b0 text2 = text != null ? text.getText() : null;
                    b51.a.FieldData.InterfaceC0401a value3 = value.getValue();
                    b51.a.FieldData.InterfaceC0401a.Date date = value3 instanceof b51.a.FieldData.InterfaceC0401a.Date ? (b51.a.FieldData.InterfaceC0401a.Date) value3 : null;
                    fz.b.LocalDate data = date != null ? date.getData() : null;
                    b51.a.FieldData.InterfaceC0401a value4 = value.getValue();
                    b51.a.FieldData.InterfaceC0401a.DropDown dropDown = value4 instanceof b51.a.FieldData.InterfaceC0401a.DropDown ? (b51.a.FieldData.InterfaceC0401a.DropDown) value4 : null;
                    CitizenshipDictionary data2 = dropDown != null ? dropDown.getData() : null;
                    List listQ = pq.v.q(text2, data, data2);
                    if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
                        Iterator it4 = listQ.iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                switch (a.f223954a[key.ordinal()]) {
                                    case 1:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, text2, null, null, null, null, null, null, null, null, 510, null);
                                        break;
                                    case 2:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, text2, null, null, null, null, null, null, null, 509, null);
                                        break;
                                    case 3:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, null, text2, null, null, null, null, null, null, 507, null);
                                        break;
                                    case 4:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, null, null, text2, null, null, null, null, null, 503, null);
                                        break;
                                    case 5:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, null, null, null, text2, null, null, null, null, 495, null);
                                        break;
                                    case 6:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, null, null, null, null, text2, null, null, null, 479, null);
                                        break;
                                    case 7:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, null, null, null, null, null, data, null, null, 447, null);
                                        break;
                                    case 8:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, null, null, null, null, null, null, text2, null, 383, null);
                                        break;
                                    case 9:
                                        secondParentB = BEChildBirthParents.SecondParent.b(secondParent2, null, null, null, null, null, null, null, null, (data2 == null || (name = data2.getName()) == null) ? null : iy.c0.g(name), GF2Field.MASK, null);
                                        break;
                                    default:
                                        throw new oq.p();
                                }
                                BEChildBirthParents.SecondParent secondParent3 = secondParentB;
                                bEChildBirthParentsB2 = BEChildBirthParents.b(bEChildBirthParentsB2, null, secondParent3, null, null, null, null, 61, null);
                                secondParent2 = secondParent3;
                                break;
                            }
                        }
                    }
                }
                bEChildBirthParents = bEChildBirthParentsB2;
            } else {
                if (aVar instanceof b51.a.MotherPlaceOfBirthCertificate) {
                    bEChildBirthParentsB = bEChildBirthParents;
                    for (Map.Entry<b51.a.MotherPlaceOfBirthCertificate.EnumC0404a, b51.a.FieldData> entry2 : ((b51.a.MotherPlaceOfBirthCertificate) aVar).b().entrySet()) {
                        b51.a.MotherPlaceOfBirthCertificate.EnumC0404a key2 = entry2.getKey();
                        b51.a.FieldData.InterfaceC0401a value5 = entry2.getValue().getValue();
                        b51.a.FieldData.InterfaceC0401a.Text text3 = value5 instanceof b51.a.FieldData.InterfaceC0401a.Text ? (b51.a.FieldData.InterfaceC0401a.Text) value5 : null;
                        iy.b0 text4 = text3 != null ? text3.getText() : null;
                        BEChildBirthParents.BirthCertificate motherPlaceOfBirthCertificate = bEChildBirthParentsB.getMotherPlaceOfBirthCertificate();
                        if (motherPlaceOfBirthCertificate == null) {
                            motherPlaceOfBirthCertificate = new BEChildBirthParents.BirthCertificate(iy.c0.g(""), null, 2, null);
                        }
                        int i15 = a.f223955b[key2.ordinal()];
                        if (i15 == 1) {
                            if (text4 == null) {
                                text4 = iy.c0.g("");
                            }
                            birthCertificateB = BEChildBirthParents.BirthCertificate.b(motherPlaceOfBirthCertificate, text4, null, 2, null);
                        } else {
                            if (i15 != 2) {
                                throw new oq.p();
                            }
                            birthCertificateB = BEChildBirthParents.BirthCertificate.b(motherPlaceOfBirthCertificate, null, text4, 1, null);
                        }
                        bEChildBirthParentsB = BEChildBirthParents.b(bEChildBirthParentsB, null, null, birthCertificateB, null, null, null, 59, null);
                    }
                } else if (aVar instanceof b51.a.FatherPlaceOfBirthCertificate) {
                    bEChildBirthParentsB = bEChildBirthParents;
                    for (Map.Entry<b51.a.FatherPlaceOfBirthCertificate.EnumC0400a, b51.a.FieldData> entry3 : ((b51.a.FatherPlaceOfBirthCertificate) aVar).b().entrySet()) {
                        b51.a.FatherPlaceOfBirthCertificate.EnumC0400a key3 = entry3.getKey();
                        b51.a.FieldData.InterfaceC0401a value6 = entry3.getValue().getValue();
                        b51.a.FieldData.InterfaceC0401a.Text text5 = value6 instanceof b51.a.FieldData.InterfaceC0401a.Text ? (b51.a.FieldData.InterfaceC0401a.Text) value6 : null;
                        iy.b0 text6 = text5 != null ? text5.getText() : null;
                        BEChildBirthParents.BirthCertificate fatherPlaceOfBirthCertificate = bEChildBirthParentsB.getFatherPlaceOfBirthCertificate();
                        if (fatherPlaceOfBirthCertificate == null) {
                            fatherPlaceOfBirthCertificate = new BEChildBirthParents.BirthCertificate(iy.c0.g(""), null, 2, null);
                        }
                        int i16 = a.f223956c[key3.ordinal()];
                        if (i16 == 1) {
                            if (text6 == null) {
                                text6 = iy.c0.g("");
                            }
                            birthCertificateB2 = BEChildBirthParents.BirthCertificate.b(fatherPlaceOfBirthCertificate, text6, null, 2, null);
                        } else {
                            if (i16 != 2) {
                                throw new oq.p();
                            }
                            birthCertificateB2 = BEChildBirthParents.BirthCertificate.b(fatherPlaceOfBirthCertificate, null, text6, 1, null);
                        }
                        bEChildBirthParentsB = BEChildBirthParents.b(bEChildBirthParentsB, null, null, null, birthCertificateB2, null, null, 55, null);
                    }
                } else if (aVar instanceof b51.a.MarriageCertificate) {
                    bEChildBirthParentsB = bEChildBirthParents;
                    for (Map.Entry<b51.a.MarriageCertificate.EnumC0403a, b51.a.FieldData> entry4 : ((b51.a.MarriageCertificate) aVar).b().entrySet()) {
                        b51.a.MarriageCertificate.EnumC0403a key4 = entry4.getKey();
                        b51.a.FieldData.InterfaceC0401a value7 = entry4.getValue().getValue();
                        b51.a.FieldData.InterfaceC0401a.Text text7 = value7 instanceof b51.a.FieldData.InterfaceC0401a.Text ? (b51.a.FieldData.InterfaceC0401a.Text) value7 : null;
                        iy.b0 text8 = text7 != null ? text7.getText() : null;
                        BEChildBirthParents.MarriageCertificate marriageCertificate = bEChildBirthParentsB.getMarriageCertificate();
                        if (marriageCertificate == null) {
                            marriageCertificate = new BEChildBirthParents.MarriageCertificate(iy.c0.g(""), null, 2, null);
                        }
                        int i17 = a.f223957d[key4.ordinal()];
                        if (i17 == 1) {
                            if (text8 == null) {
                                text8 = iy.c0.g("");
                            }
                            marriageCertificateB = BEChildBirthParents.MarriageCertificate.b(marriageCertificate, text8, null, 2, null);
                        } else {
                            if (i17 != 2) {
                                throw new oq.p();
                            }
                            marriageCertificateB = BEChildBirthParents.MarriageCertificate.b(marriageCertificate, null, text8, 1, null);
                        }
                        bEChildBirthParentsB = BEChildBirthParents.b(bEChildBirthParentsB, null, null, null, null, null, marriageCertificateB, 31, null);
                    }
                } else if (aVar instanceof b51.a.YourBirthCertificate) {
                    bEChildBirthParentsB = bEChildBirthParents;
                    for (Map.Entry<b51.a.YourBirthCertificate.EnumC0406a, b51.a.FieldData> entry5 : ((b51.a.YourBirthCertificate) aVar).b().entrySet()) {
                        b51.a.YourBirthCertificate.EnumC0406a key5 = entry5.getKey();
                        b51.a.FieldData.InterfaceC0401a value8 = entry5.getValue().getValue();
                        b51.a.FieldData.InterfaceC0401a.Text text9 = value8 instanceof b51.a.FieldData.InterfaceC0401a.Text ? (b51.a.FieldData.InterfaceC0401a.Text) value8 : null;
                        iy.b0 text10 = text9 != null ? text9.getText() : null;
                        BEChildBirthParents.BirthCertificate yourBirthPlaceOfBirthCertificate = bEChildBirthParentsB.getYourBirthPlaceOfBirthCertificate();
                        if (yourBirthPlaceOfBirthCertificate == null) {
                            yourBirthPlaceOfBirthCertificate = new BEChildBirthParents.BirthCertificate(iy.c0.g(""), null, 2, null);
                        }
                        int i18 = a.f223958e[key5.ordinal()];
                        if (i18 == 1) {
                            if (text10 == null) {
                                text10 = iy.c0.g("");
                            }
                            birthCertificateB3 = BEChildBirthParents.BirthCertificate.b(yourBirthPlaceOfBirthCertificate, text10, null, 2, null);
                        } else {
                            if (i18 != 2) {
                                throw new oq.p();
                            }
                            birthCertificateB3 = BEChildBirthParents.BirthCertificate.b(yourBirthPlaceOfBirthCertificate, null, text10, 1, null);
                        }
                        bEChildBirthParentsB = BEChildBirthParents.b(bEChildBirthParentsB, null, null, null, null, birthCertificateB3, null, 47, null);
                    }
                } else {
                    if (!(aVar instanceof b51.a.FatherName)) {
                        throw new oq.p();
                    }
                    BEChildBirthParents bEChildBirthParentsB3 = bEChildBirthParents;
                    for (Map.Entry<b51.a.FatherName.EnumC0399a, b51.a.FieldData> entry6 : ((b51.a.FatherName) aVar).b().entrySet()) {
                        b51.a.FatherName.EnumC0399a key6 = entry6.getKey();
                        b51.a.FieldData.InterfaceC0401a value9 = entry6.getValue().getValue();
                        b51.a.FieldData.InterfaceC0401a.Text text11 = value9 instanceof b51.a.FieldData.InterfaceC0401a.Text ? (b51.a.FieldData.InterfaceC0401a.Text) value9 : null;
                        iy.b0 text12 = text11 != null ? text11.getText() : null;
                        BEChildBirthParents.SecondParent secondParent4 = bEChildBirthParentsB3.getSecondParent();
                        BEChildBirthParents.SecondParent secondParent5 = secondParent4 == null ? new BEChildBirthParents.SecondParent(null, null, null, null, null, null, null, null, null, 511, null) : secondParent4;
                        if (a.f223959f[key6.ordinal()] != 1) {
                            throw new oq.p();
                        }
                        bEChildBirthParentsB3 = BEChildBirthParents.b(bEChildBirthParentsB3, null, BEChildBirthParents.SecondParent.b(secondParent5, text12, null, null, null, null, null, null, null, null, 510, null), null, null, null, null, 61, null);
                    }
                    bEChildBirthParents = bEChildBirthParentsB3;
                }
                bEChildBirthParents = bEChildBirthParentsB;
            }
        }
        return bEChildBirthParents;
    }
}
