package xl0;

import al0.AdditionalAttachmentsData;
import al0.Adult;
import al0.BEFileInfo;
import fr.t;
import gm0.AddressDataDto;
import gm0.ContactDetailsDto;
import gm0.GeneratePhysicalIdCardXmlApplicationV4Request;
import gm0.PersonalDataDto;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxl0/a;", "Lxw/f;", "Lxl0/a$a;", "Lgm0/i2;", "Lxl0/l;", "pickedFileToFileV4DtoMapper", "<init>", "(Lxl0/l;)V", "params", "c", "(Lxl0/a$a;)Lgm0/i2;", "a", "Lxl0/l;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, GeneratePhysicalIdCardXmlApplicationV4Request> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l pickedFileToFileV4DtoMapper;

    /* JADX INFO: renamed from: xl0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxl0/a$a;", "", "Lal0/d;", "data", "<init>", "(Lal0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/d;", "()Lal0/d;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Adult data;

        public Params(Adult adult) {
            this.data = adult;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Adult getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    public a(l lVar) {
        this.pickedFileToFileV4DtoMapper = lVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public GeneratePhysicalIdCardXmlApplicationV4Request b(Params params) {
        Adult data = params.getData();
        PersonalDataDto personalDataDtoM = f.m(data.getApplicantData());
        ContactDetailsDto contactDetailsDtoK = f.k(data.getBeContactDetailsData());
        AddressDataDto addressDataDtoI = f.i(data.getCorrespondenceAddressData());
        String id5 = data.getCommunityOffice().getId();
        gm0.i iVarJ = f.j(data.getReasonForApplying());
        boolean hasPersonalSigningCertificate = data.getHasPersonalSigningCertificate();
        wx.i.Image file = data.getAddPhotoData().getFile();
        AdditionalAttachmentsData additionalAttachmentsData = data.getAdditionalAttachmentsData();
        wx.i coveringFaceFile = additionalAttachmentsData != null ? additionalAttachmentsData.getCoveringFaceFile() : null;
        if (!data.getAddPhotoData().getIsAnyAdditionalPhotoSelected()) {
            coveringFaceFile = null;
        }
        AdditionalAttachmentsData additionalAttachmentsData2 = data.getAdditionalAttachmentsData();
        List<wx.i> listS = v.s(file, coveringFaceFile, data.getAddPhotoData().getIsAnyAdditionalPhotoSelected() ? additionalAttachmentsData2 != null ? additionalAttachmentsData2.getGlassesFile() : null : null);
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        for (wx.i iVar : listS) {
            arrayList.add(this.pickedFileToFileV4DtoMapper.b(new l.Params(iVar, t.c(iVar, data.getAddPhotoData().getFile()) ? BEFileInfo.a.Photo : BEFileInfo.a.Attachment)));
        }
        return new GeneratePhysicalIdCardXmlApplicationV4Request(addressDataDtoI, iVarJ, id5, arrayList, hasPersonalSigningCertificate, personalDataDtoM, contactDetailsDtoK, null, 128, null);
    }
}
