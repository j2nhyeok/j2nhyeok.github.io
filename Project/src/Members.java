import java.util.ArrayList;
import java.util.List;

public class Members {
	private List<Buyer> member = new ArrayList<>();
	
	public static Buyer signUp( Buyer id, Buyer Name ) {
		Buyer a = new Buyer("id","Name");
		return a;
	}

	// 모든 바이어의 로또 번호 반환 (메소드)
	public List<List<Integer>> lottosOfMembers() {
		List<List<Integer>> temp = new ArrayList<>();
		for (int i = 0; i < member.size(); i++) {
			temp.addAll(member.get(i).getLottoLines());
		}
		return temp;
	}
	
	public List<Buyer> getMember() {
		return member;
	}

	public void setMember(List<Buyer> member) {
		this.member = member;
	}

	public void addIdName(String name, String id) {
		member.add(new Buyer(name, id));
	}
	
	public int getIndex(String id) {
		int index = 0;
		for (int i = 0; i < member.size(); i++) {
			if(member.get(i).getId().equals(id)) {
				index = i;
			}
		}
		return index;
	}
	
	@Override
	public String toString() {
		return "Members [member=" + member + "]";
	}

	public void addMember(String id, String Name) {
		member.add(new Buyer(id, Name));
	}
}
