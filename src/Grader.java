public class Grader {
	private double score;
	Grader(double score){
		this.score = score;
	}
	public char letterGrade() {
		if(this.score >= 0 && this.score <= 50) return 'F';
		else if(this.score >= 50 && this.score <= 70) return 'C';
		else if(this.score >= 70 && this.score <= 80) return 'B';
		else if(this.score >= 80 && this.score <= 90) return 'A';
		else if(this.score >= 90 && this.score <= 95) return 'E';
		else if(this.score == 100 ) return 'O';
		return '$';
	}
}
